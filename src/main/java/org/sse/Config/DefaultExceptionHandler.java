package org.sse.Config;

import org.sse.common.CommonResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;



@RestControllerAdvice
public class DefaultExceptionHandler {

    @ExceptionHandler
    public CommonResult exceptionHandler(HttpServletRequest request, Exception ex) {
        ex.printStackTrace();
        if(ex instanceof NoHandlerFoundException) {
            return CommonResult.nohandler();
        }
        return CommonResult.failed(ex.getMessage());
    }


}
