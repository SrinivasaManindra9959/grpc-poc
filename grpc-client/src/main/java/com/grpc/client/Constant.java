package com.grpc.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Constant {
/*
    @Value("timeout")
    private String timeout;

    public Long getTimeout(){
       return Long.valueOf(timeout);
    }*/

    public static final Long timeout = 3000L;



}
