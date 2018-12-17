package com.qqmy.util;

import com.qqmy.entity.CattleRequirment;
import com.qqmy.entity.SiLiao;
import com.qqmy.entity.YuanLiao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class CattleSiliao implements YuanLiao{

    public static Map<String, Double> calcular(CattleRequirment requirment) throws IOException, IllegalAccessException, ClassNotFoundException {
        Map<String, Double> map = new TreeMap<>();
        requirment.decreaseEnergy(1663.32);
        //TODO 青贮饲料和干草处理

        WriteToFile.writeVariable(requirment, "D:\\a.txt");
        //ProcessBuilder
        Random r = new Random();
        int i = r.nextInt(1000);
        Process proc = null;
        try {
            proc = Runtime.getRuntime().exec("python " + "D:\\Users\\zmz\\PycharmProjects\\LinerBest\\LinerBest.py " + i);
            proc.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        double[] data = WriteToFile.readData(i);
        String[] siliao = new WriteToFile().getYuanliaoList();
        for(int k = 0; k < 13; k++)
        {
            map.put(siliao[k], data[k]);
        }

        File f = new File("D:\\Users\\zmz\\PycharmProjects\\LinerBest\\LinerBest.py " + i);
        f.delete();
        return map;
    }

    public static SiLiao getSiLiaoObjByName(String name)
    {
        SiLiao result = null;
        switch (name)
        {
            case  "YuMi" : return YuanLiao.YuMi;
            case "FuPi" : return YuanLiao.FuPi;
            case "DouPo" : return YuanLiao.DouPo;
            case "MianPo" : return YuanLiao.MianPo;
            case "DaMai" : return YuanLiao.DaMai;
            case "MuXuFen" : return YuanLiao.MuXuFen;
            case "CaiPo" : return YuanLiao.CaiPo;
            case "ShiYan" : return YuanLiao.ShiYan;
            case "CaHp" : return YuanLiao.CaHp;
            case "LaiAnSuan" : return YuanLiao.LaiAnSuan;
            case "DanAnSuan" : return YuanLiao.DanAnSuan;
            case "NiaoSu" : return YuanLiao.NiaoSu;
            case "LinSuanYiGai" : return YuanLiao.LinSuanYiGai;
            default:return null;
        }
    }


    public double getProteinPercent(Map<String, Object> map, double sum)
    {
        double result = 0;
        for(String key: map.keySet())
        {
            double perc = (Double) map.get(key);
            SiLiao s = getSiLiaoObjByName(key);
            //result += s.getProtein()*0.01
        }
        return 0;
    }
}
