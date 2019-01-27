package com.dogeye.vo;

import lombok.Data;

@Data
public class ResultsVo<T> {

    private String msg;
    private Integer code;
    private Object object;
}
