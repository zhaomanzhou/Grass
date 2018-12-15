package com.qqmy.util;

import com.qqmy.entity.CattleRequirment;
import com.qqmy.entity.SiLiao;

import java.util.HashMap;
import java.util.Map;

public class CattleSiliao {

    public Map<SiLiao, Double> calcular(CattleRequirment requirment)
    {
        Map<SiLiao, Double> map = new HashMap<>();
        requirment.decreaseEnergy(1663.32);
        //TODO 青贮饲料和干草处理






        return map;
    }
}
