package com.qqmy.util;

import com.qqmy.entity.CattleRequirment;
import com.qqmy.entity.SiLiao;
import com.qqmy.entity.YuanLiao;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

public class WriteToFile {
    Class c = Class.forName("com.qqmy.entity.YuanLiao");
    Class c2 = Class.forName("com.qqmy.entity.SiLiao");
    //Class c3 = Class.forName("")

    public WriteToFile() throws ClassNotFoundException, IllegalAccessException {

    }

    public static void writeVariable(CattleRequirment requirment, String name) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(name);
        pw.println(requirment.toString1());
        pw.close();
    }

    public static double[] readData(int index) throws IOException {
        double[] result = new double[13];
        BufferedReader bf  = new BufferedReader(new FileReader("d://result"+index+"+.txt"));
        for(int i = 0; i < 13; i++)
        {
            result[i] = Double.parseDouble(bf.readLine());
        }
        bf.close();
        return result;

    }

    public void writeConst(String filename) throws IllegalAccessException, FileNotFoundException {
        PrintWriter pw = new PrintWriter(filename);
        Field[] declaredFields = c.getDeclaredFields();
        for(Field f : declaredFields)
        {
            SiLiao x = (SiLiao)f.get(new YuanLiao() {});
            System.out.println(x);
            pw.println(x.toString1());
        }

        pw.close();
    }

    public  String[] getYuanliaoList() throws IllegalAccessException {
        String[] result = new String[13];
        Field[] declaredFields = c.getDeclaredFields();
        int i = 0;
        for(Field f : declaredFields)
        {

            result[i++] = f.getName();

        }
        return result;
    }
}
