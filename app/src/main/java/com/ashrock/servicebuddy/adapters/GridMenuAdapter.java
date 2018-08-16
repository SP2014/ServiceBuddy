package com.ashrock.servicebuddy.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.ashrock.servicebuddy.R;

public class GridMenuAdapter extends BaseAdapter {
    private Context context;

    public GridMenuAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 8;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View gridView;
        if(view==null){
            gridView = new View(context);
            gridView = inflater.inflate(R.layout.grid_menu_item,null);

        }else{
            gridView = (View)view;
        }
        return gridView;
    }
}
