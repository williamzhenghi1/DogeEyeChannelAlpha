package com.dogeye.config;

import com.dogeye.Utils.ResultsVoUtils;
import com.dogeye.exception.ChannelNotFoundException;
import com.dogeye.vo.ResultsVo;
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
