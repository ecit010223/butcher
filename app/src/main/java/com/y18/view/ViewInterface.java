package com.y18.view;

/**
 * Author: zyh
 * Date: 2018/11/13 17:03
 */
public interface ViewInterface {
    void success(int tag,Object result);
    void fail(int tag,Object failure);
}
