package com.wxprogram.service.impl;

import com.wxprogram.dao.AreaDao;
import com.wxprogram.entity.Area;
import com.wxprogram.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created By Cx On 2018/5/2 23:26
 */
@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    AreaDao areaDao;

    @Override
    public List<Area> queryAll() {
        return areaDao.queryAllArea();
    }

    @Override
    public Area queryAreaById(int id) {
        return areaDao.queryAreaById(id);
    }

    @Override
    public Area updateArea(Area area) {
        if (area.getId() != null && area.getId()>0){
            //如果Id合法
            if ((area.getName() != null && !area.getName().trim().equals("")) || area.getPriority() != null){
                //更新内容不为空
                area.setLastEditTime(new Date().getTime());
                int count = areaDao.updateArea(area);
                if (count < 1){
                    throw new RuntimeException("更新失败");
                }
            } else {
                throw new RuntimeException("更新内容为空");
            }
        }else{
            throw new RuntimeException("Id不合法");
        }
        return areaDao.queryAreaById(area.getId());
    }

    @Override
    public boolean delAreaById(int id) {
        if (areaDao.delAreaById(id) < 1){
            return false;
        }
        return true;
    }

    @Override
    public boolean addArea(Area area) {
        if (area.getName() != null && !area.getName().trim().equals("")){
            //如果名字合法
            area.setLastEditTime(new Date().getTime());
            area.setCreateTime(new Date().getTime());
            int count = areaDao.insertArea(area);
            if (count < 1){
                throw new RuntimeException("添加失败");
            }
        }else{
            throw new RuntimeException("名字不合法");
        }
        return true;
    }
}
