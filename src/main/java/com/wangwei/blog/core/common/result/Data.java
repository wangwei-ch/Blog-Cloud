package com.wangwei.blog.core.common.result;

import lombok.extern.slf4j.Slf4j;

@lombok.Data
@Slf4j
public class Data<T> {

    private String code;
    private String msg;
    private T data;

}
