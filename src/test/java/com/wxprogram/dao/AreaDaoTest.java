package com.wxprogram.dao;

import com.wxprogram.entity.Area;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created By Cx On 2018/5/2 19:22
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Transactional
public class AreaDaoTest {

    @Autowired
    private AreaDao areaDao;

    @Test
    public void queryAllArea() {
        System.out.println(areaDao.queryAllArea());
    }

    @Test
    public void queryAreaById() {
        System.out.println(areaDao.queryAreaById(5));
    }

    @Test
    public void insertArea() {
        Area area = new Area();
        area.setCreateTime(new Date().getTime());
        area.setId(7);
        area.setPriority(3);
        area.setName("暂定");
        areaDao.insertArea(area);
        System.out.println(area.getId());
    }

    @Test
    public void delAreaById() {
        areaDao.delAreaById(1);
    }

    @Test
    public void updateArea(){
        Area area = new Area();
        area.setId(5);
        area.setPriority(2);
        System.out.println(areaDao.updateArea(area));
    }
}