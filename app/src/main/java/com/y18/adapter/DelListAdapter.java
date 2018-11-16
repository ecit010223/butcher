package com.y18.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.y18.R;

import java.util.List;

/**
 * Author: zyh
 * Date: 2018/11/16 13:18
 */
public class DelListAdapter extends ArrayAdapter<String> {

    public DelListAdapter(Context context, int textViewResourceId, List<String> objects){
        super(context,textViewResourceId,objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if(convertView==null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.del_list_item,null);
        }else {
            view = convertView;
        }
        TextView textView = (TextView) view.findViewById(R.id.tv_del_list_item);
        textView.setText(getItem(position));
        return view;
    }
}
