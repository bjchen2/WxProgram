package com.wxprogram.dao;

import com.wxprogram.entity.Area;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By Cx On 2018/5/2 19:11
 */
public interface AreaDao {

    /**
     * 查询所有区域
     */
    List<Area> queryAllArea();

    /**
     * 通过id查询对应的唯一Area
     */
    Area queryAreaById(int id);

    /**
     * 添加area
     */
    int insertArea(Area area);

    /**
     * 更新area信息
     */
    int updateArea(Area area);

    /**
     * 通过Id删除对应Area
     */
    int delAreaById(int id);
}
