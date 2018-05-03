package com.wxprogram.service;

import com.wxprogram.entity.Area;

import java.util.List;

/**
 * Created By Cx On 2018/5/2 23:26
 */
public interface AreaService {

    /**
     * 查询所有Area
     */
    List<Area> queryAll();

    /**
     * 通过Id查询Area
     */
    Area queryAreaById(int id);

    /**
     * 通过传入的area更新Area
     */
    Area updateArea(Area area);

    /**
     * 通过Id删除Area
     */
    boolean delAreaById(int id);

    /**
     * 创建Area
     */
    boolean addArea(Area area);
}
