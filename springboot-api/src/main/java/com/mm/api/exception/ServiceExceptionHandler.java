package com.mm.api.exception;

import com.mm.api.common.R;
import com.mm.api.exception.ServiceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class ServiceExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public R handle(Exception e) {
        if (e instanceof ServiceException) {
            ServiceException serviceException = (ServiceException) e;
            return R.error(serviceException.getMsg());
        } else {
            log.error("【系统异常】:", e);
            return R.error("系统异常");
        }
    }
}