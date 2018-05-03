package com.wxprogram.handler;

import com.wxprogram.util.FormatResponseUtil;
import com.wxprogram.util.ResponseResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created By Cx On 2018/5/3 13:13
 */
@RestControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(Exception.class)
    private ResponseResult exceptionHandle(Exception e){
        return FormatResponseUtil.error(e);
    }
}
