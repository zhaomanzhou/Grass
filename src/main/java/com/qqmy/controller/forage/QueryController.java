package com.qqmy.controller.forage;

import com.qqmy.entity.Cattle;
import com.qqmy.entity.CattleRequirment;
import com.qqmy.entity.SiLiao;
import com.qqmy.util.CattleSiliao;
import com.sun.deploy.net.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class QueryController {

    @ResponseBody
    @RequestMapping("/queryFormular")
    public String qureyormular(Cattle c,  Map<String, Object> calcular)
    {

        CattleRequirment requirment = CattleRequirment.getRequirment(c);
        Map<String, Double> percent = null;
        try {
           percent  = CattleSiliao.calcular(requirment);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        double sum = 0;
        for(Map.Entry<String, Double> entry : percent.entrySet())
        {
            sum += entry.getValue();
        }

        calcular.put("percent", percent);
        calcular.put("sum", sum);

        return calcular.toString();
    }
}
