package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.po.Seckill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * 配置spring和junit整合
 * junit启动时加载spring IOC容器
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class SeckillDaoTest {

    @Autowired
    private SeckillDao seckillDao;

    @Test
    public void reduceNumber() {
        Date killTime = new Date();
        int updateCount = seckillDao.reduceNumber(1000L,killTime);
        System.out.println(updateCount);
    }

    @Test
    public void queryById() {
        long id = 1000;
        Seckill seckill = seckillDao.queryById(1000);
        System.out.println(seckill.getName());
    }

    @Test
    public void queryAll() {
        List<Seckill> list = seckillDao.queryAll(0, 100);
        for(Seckill seckill : list) {
            System.out.println(seckill);
        }
    }
}