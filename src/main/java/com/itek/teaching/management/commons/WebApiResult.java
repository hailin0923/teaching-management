/**
 * @Author mlsong
 * @Date 2019/9/12 0012
 * @Description
 */
package com.itek.teaching.management.commons;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @program: teaching-management
 * @description: api请求结果
 * @author: mlsong
 * @create: 2019-09-12 14:48
 **/
@Data
@Accessors(chain = true)
public class WebApiResult<T> implements Serializable {

    public WebApiResult() {
        setResult(WebApiResultEnum.SUCCESS);
    }

    /**
     * 返回结果状态码
     */
    private int code;
    /**
     * 状态码描述
     */
    private String msg;
    /**
     * 返回实际数据
     */
    private T data;

    public void setResult(WebApiResultEnum result) {
        this.code = result.getCode();
        this.msg = result.getMsg();
    }

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
