/**
 * @Author mlsong
 * @Date 2019/9/18 0018
 * @Description
 */
package com.itek.teaching.management.controller;

import com.itek.teaching.management.commons.WebApiResult;
import com.itek.teaching.management.commons.WebApiResultEnum;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Objects;

/**
 * @program: teaching-management
 * @description:
 * @author: mlsong
 * @create: 2019-09-18 11:19
 **/
@RestControllerAdvice
public class HandleExceptionController {

    @ExceptionHandler(Exception.class)
    public WebApiResult<String> handleControllerExcepton(Exception e) {
        WebApiResult<String> result = new WebApiResult<String>();

        result.setResult(WebApiResultEnum.FAILED);
        result.setData(e.getMessage());

        return result;
    }
}
