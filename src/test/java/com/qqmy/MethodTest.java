package com.qqmy;

import com.qqmy.entity.Cattle;
import com.qqmy.entity.CattleRequirment;
import com.qqmy.util.WriteToFile;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;

public class MethodTest {

    Cattle c = new Cattle(100, 1, 12, 20, 17, 9);
    CattleRequirment requirment;

    @Before
    public void before()
    {
        requirment = CattleRequirment.getRequirment(c);
    }

    @Test
    public void testToString()
    {
        System.out.println(requirment);
    }

    @Test
    public void test01() throws ClassNotFoundException, IllegalAccessException, FileNotFoundException {
        new WriteToFile().writeVariable(requirment, "D:\\variable.txt");
    }

    @Test
    public void test02() throws IllegalAccessException, ClassNotFoundException, FileNotFoundException {
        new WriteToFile().writeConst("D:\\const.txt");
    }

    @Test
    public void test03()
    {
        int j = 8;

        String str = "list1[0]["+j+"] * n1";
        for(int i = 1; i < 13; i++)
        {
            str += " + list1["+i+"]["+j+"] * n"+(i+1);
        }
        System.out.println(str);
    }
}
