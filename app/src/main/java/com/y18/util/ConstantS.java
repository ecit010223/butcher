package com.y18.util;

/**
 * Author: zyh
 * Date: 2018/11/14 9:42
 */
public enum ConstantS {
    TAG("alex");

    private final String value;

    ConstantS(String value){
        this.value = value;
    }

    public String value(){
        return value;
    }
}
