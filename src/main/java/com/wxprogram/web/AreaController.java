package com.wxprogram.web;

import com.wxprogram.entity.Area;
import com.wxprogram.service.AreaService;
import com.wxprogram.util.FormatResponseUtil;
import com.wxprogram.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created By Cx On 2018/5/3 12:12
 */
@RestController
@RequestMapping("/area")
public class AreaController {

    @Autowired
    AreaService areaService;

    @GetMapping("/areaList")
    public ResponseResult queryAll(){
        return FormatResponseUtil.formatResponse(areaService.queryAll());
    }

    @GetMapping("/one")
    public ResponseResult queryById(int id){
        return FormatResponseUtil.formatResponse(areaService.queryAreaById(id));
    }

    @PostMapping()
    public ResponseResult addArea(Area area){
        return FormatResponseUtil.formatResponse(areaService.addArea(area));
    }

    @DeleteMapping("/delete")
    public ResponseResult delAreaById(int id){
        return FormatResponseUtil.formatResponse(areaService.delAreaById(id));
    }

    @PostMapping("/areaInfo")
    public ResponseResult updateArea(Area area){
        return FormatResponseUtil.formatResponse(areaService.updateArea(area));
    }
}
