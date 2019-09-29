/**
 * @Author mlsong
 * @Date 2019/9/12 0012
 * @Description
 */
package com.itek.teaching.management.commons;

import lombok.Data;

/**
 * @program: teaching-management
 * @description: webapi结果枚举类
 * @author: mlsong
 * @create: 2019-09-12 14:50
 **/
public enum WebApiResultEnum {

    SUCCESS         (1,  "请求成功！"),
    FAILED          (-1, "请求失败！");

    WebApiResultEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
