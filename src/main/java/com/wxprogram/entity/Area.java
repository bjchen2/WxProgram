package com.wxprogram.entity;

import lombok.Data;

/**
 * Created By Cx On 2018/5/2 18:24
 */
@Data
public class Area {
    private Integer id;
    private String name;
    private Integer priority;
    private Long createTime;
    private Long lastEditTime;
}
