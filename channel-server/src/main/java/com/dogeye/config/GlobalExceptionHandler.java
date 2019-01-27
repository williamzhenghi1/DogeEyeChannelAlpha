package com.dogeye.config;

import com.dogeye.Emus.ChannelEmus;
import com.dogeye.Utils.ResultsVoUtils;
import com.dogeye.exception.ChannelNotFoundException;
import com.dogeye.vo.ResultsVo;

import org.apache.http.HttpException;
import org.apache.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = ChannelNotFoundException.class)
    @ResponseBody
    public ResultsVo defaultErrorHandler(){
        return ResultsVoUtils.fail();
    }


}
