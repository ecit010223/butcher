package com.y18.util;

import android.util.Log;

/**
 * Author: zyh
 * Date: 2018/11/14 9:20
 */
public enum TLog {
    INSTANCE;

    public void v(final String msg){
        if(ConstantB.DEVELOPMENT.bool()) {
            Log.v(ConstantS.TAG.value(), msg);
        }
    }

    public void d(final String msg){
        if(ConstantB.DEVELOPMENT.bool()) {
            Log.d(ConstantS.TAG.value(), msg);
        }
    }

    public void i(final String msg){
        if(ConstantB.DEVELOPMENT.bool()) {
            Log.i(ConstantS.TAG.value(), msg);
        }
    }

    public void w(final String msg){
        if(ConstantB.DEVELOPMENT.bool()) {
            Log.w(ConstantS.TAG.value(), msg);
        }
    }

    public void e(final String msg){
        if(ConstantB.DEVELOPMENT.bool()) {
            Log.e(ConstantS.TAG.value(), msg);
        }
    }

    public void v(final String tag, final String msg){
        if(ConstantB.DEVELOPMENT.bool()){
            Log.v(tag,msg);
        }
    }

    public void d(final String tag,final String msg){
        if(ConstantB.DEVELOPMENT.bool()){
            Log.d(tag,msg);
        }
    }

    public void i(final String tag,final String msg){
        if(ConstantB.DEVELOPMENT.bool()){
            Log.i(tag,msg);
        }
    }

    public void w(final String tag,final String msg){
        if(ConstantB.DEVELOPMENT.bool()){
            Log.w(tag,msg);
        }
    }

    public void e(final String tag,final String msg){
        if(ConstantB.DEVELOPMENT.bool()){
            Log.e(tag,msg);
        }
    }
}
