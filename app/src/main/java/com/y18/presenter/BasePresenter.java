package com.y18.presenter;

import com.y18.view.ViewInterface;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/**
 * Author: zyh
 * Date: 2018/11/13 17:03
 */
public abstract class BasePresenter<V extends ViewInterface> {
    private Reference<V> mViewRef;

    public BasePresenter(V view){
        this.attachView(view);
    }

    private void attachView(V view){
        mViewRef = new WeakReference<>(view);
    }

    public V getView(){
        return mViewRef.get();
    }

    public boolean isViewAttached(){
        return mViewRef!=null&&mViewRef.get()!=null;
    }

    public void detachView(){
        if(mViewRef!=null){
            mViewRef.clear();
            mViewRef = null;
        }
    }
}
