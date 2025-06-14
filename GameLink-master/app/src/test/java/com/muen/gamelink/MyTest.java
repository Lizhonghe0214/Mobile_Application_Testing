package com.muen.gamelink;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import android.content.Context;
import android.text.format.DateUtils;

import com.muen.gamelink.LinkGame.Constant.LinkBoard;
import com.muen.gamelink.LinkGame.Manager.LinkManager;
import com.muen.gamelink.LinkGame.Model.AnimalPoint;
import com.muen.gamelink.LinkGame.SelfView.AnimalView;
import com.muen.gamelink.Model.XLLevel;
import com.muen.gamelink.Model.XLProp;
import com.muen.gamelink.Music.BackgroundMusicManager;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class MyTest
{

    @Before
    public void setUp() throws Exception{
        System.out.println("测试开始！");
    }

    @After
    public void tearDown() throws Exception{
        System.out.println("测试结束！");
    }

    @Test
    public void stampToDataTest() throws Exception{
        System.out.println("测试中");

        // 关卡类
        XLLevel level=new XLLevel();
        System.out.println(level.getId());
        level.setId(5);
        System.out.println(level.getId());

        System.out.println(level.getL_time());
        level.setL_time(60);
        System.out.println(level.getL_time());

        System.out.println(level.getL_mode());
        level.setL_mode('1');
        System.out.println(level.getL_mode());



        // 道具类
        XLProp prop=new XLProp();
        prop.setP_kind('2');
        System.out.println(prop.getP_kind());
        prop.setP_number(25);
        System.out.println(prop.getP_number());
        prop.setP_price(100);
        System.out.println(prop.getP_price());
        System.out.println(prop.toString());

        // 简单关卡模板
        AnimalPoint p1=new AnimalPoint(1,1);
        AnimalPoint p2=new AnimalPoint(1,2);


        //assertEquals(p1.toString(),p2.toString());
        assertNull("level is not null",level);


    }
}
