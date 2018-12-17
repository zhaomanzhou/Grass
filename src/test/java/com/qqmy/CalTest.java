package com.qqmy;

import com.qqmy.entity.Cattle;
import com.qqmy.entity.CattleRequirment;
import com.qqmy.util.CattleSiliao;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class CalTest {
    Cattle c = new Cattle(100, 1, 12, 20, 17, 9);
    CattleRequirment requirment;

    @Before
    public void before()
    {
        requirment = CattleRequirment.getRequirment(c);
    }
    @Test
    public void test() throws IOException, ClassNotFoundException, IllegalAccessException {
        CattleSiliao.calcular(requirment);
    }
}
