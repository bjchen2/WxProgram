package com.wxprogram.util;

import lombok.Data;

/**
 * Created By Cx On 2018/5/3 12:36
 */
@Data
public class ResponseResult {
    /**
     * 请求状态
     */
    private boolean success;
    /**
     * 返回提示信息
     */
    private String msg;
    /**
     * 返回数据
     */
    private Object data;

    public ResponseResult(boolean success, String msg, Object data) {
        this.success = success;
        this.msg = msg;
        this.data = data;
    }

    public ResponseResult(boolean code, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public ResponseResult(boolean success) {
        this.success = success;
    }
}
