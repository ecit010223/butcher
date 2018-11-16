package com.y18.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.y18.presenter.BasePresenter;

/**
 * Author: zyh
 * Date: 2018/11/13 17:06
 */
public abstract class MVPBaseActivity<T extends BasePresenter> extends AppCompatActivity {
    protected T mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = createPresenter();
    }

    @Override
    protected void onDestroy() {
        mPresenter.detachView();
        super.onDestroy();
    }

    protected abstract T createPresenter();
}
