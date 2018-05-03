package com.wxprogram.util;

/**
 * Created By Cx On 2018/5/3 12:38
 */
public class FormatResponseUtil {
    /**
     * 请求成功，不携带数据
     */
    public static ResponseResult formatResponse() {
        ResponseResult result = null;
        return formatResponse(result);
    }

    private static ResponseResult formatResponse(ResponseResult result) {
        if (result == null) {
            result = new ResponseResult(true, "请求成功", null);
        }
        return result;
    }

    /**
     * 请求成功,带数据
     */
    public static ResponseResult formatResponse(Object object) {
        return new ResponseResult(true, "请求成功", object);
    }

    /**
     * 请求成功，携带提示信息和数据
     */
    public static ResponseResult formatResponse(String msg, Object object) {
        return new ResponseResult(true, msg, object);
    }

    /**
     * 请求失败，返回错误和错误信息
     */
    public static ResponseResult error(Exception e) {
        return new ResponseResult(false, e.getMessage());
    }

    /**
     * 请求失败，返回异常信息
     */
    public static ResponseResult error(String exception) {
        return new ResponseResult(false, exception);
    }
}
