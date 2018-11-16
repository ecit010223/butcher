package com.y18.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import com.y18.R;
import com.y18.adapter.DelListAdapter;
import com.y18.view.DelListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: zyh
 * Date: 2018/11/16 11:03
 */
public class CustomActivity extends AppCompatActivity {
    private DelListView mDelListView;
    private DelListAdapter mDelListAdapter;
    private List<String> mListData = new ArrayList<>();

    public static void entry(Context from) {
        Intent intent = new Intent(from, CustomActivity.class);
        from.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_custom);
        initData();
        mDelListView = (DelListView)findViewById(R.id.dlv_custom);
        mDelListView.setOnDeleteListener(new DelListView.OnDeleteListener() {
            @Override
            public void onDelete(int index) {
                mListData.remove(index);
                mDelListAdapter.notifyDataSetChanged();
            }
        });
        mDelListAdapter = new DelListAdapter(this,0,mListData);
        mDelListView.setAdapter(mDelListAdapter);
    }

    private void initData(){
        mListData.add("Content Item 1");
        mListData.add("Content Item 2");
        mListData.add("Content Item 3");
        mListData.add("Content Item 4");
        mListData.add("Content Item 5");
        mListData.add("Content Item 6");
        mListData.add("Content Item 7");
        mListData.add("Content Item 8");
        mListData.add("Content Item 9");
        mListData.add("Content Item 10");
        mListData.add("Content Item 11");
        mListData.add("Content Item 12");
        mListData.add("Content Item 13");
        mListData.add("Content Item 14");
        mListData.add("Content Item 15");
        mListData.add("Content Item 16");
        mListData.add("Content Item 17");
        mListData.add("Content Item 18");
        mListData.add("Content Item 19");
        mListData.add("Content Item 20");
    }
}
