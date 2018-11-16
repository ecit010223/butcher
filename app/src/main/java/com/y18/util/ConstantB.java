package com.y18.util;

/**
 * Author: zyh
 * Date: 2018/11/14 9:27
 */
public enum ConstantB {
    DEVELOPMENT(true);

    private final boolean mBool;
    ConstantB(boolean bool){
        this.mBool = bool;
    }

    public boolean bool(){
        return mBool;
    }
}
