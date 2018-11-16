package com.y18.activity;

import android.os.Bundle;
import android.view.View;

import com.y18.R;
import com.y18.data.POIManager;
import com.y18.presenter.MainPresenter;
import com.y18.view.ViewInterface;

public class MainActivity extends MVPBaseActivity<MainPresenter> implements ViewInterface, View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }

    private void initUI(){
        findViewById(R.id.btn_main_readXLS).setOnClickListener(this);
        findViewById(R.id.btn_main_custom).setOnClickListener(this);
    }

    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter(this);
    }

    @Override
    public void success(int tag, Object result) {
    }

    @Override
    public void fail(int tag, Object failure) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_main_readXLS:
                POIManager.INSTANCE.readXLS();
                break;
            case R.id.btn_main_custom:
                CustomActivity.entry(this);
                break;
        }
    }
}
