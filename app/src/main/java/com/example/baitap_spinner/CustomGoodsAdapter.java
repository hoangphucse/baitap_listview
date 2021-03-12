package com.example.baitap_spinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomGoodsAdapter extends BaseAdapter {

    Context ctx;
    int layoutItem;
    ArrayList<Good> arrayList;

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public CustomGoodsAdapter(Context ctx, int layoutItem, ArrayList<Good> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(ctx).inflate(layoutItem,parent,false);
        TextView tvName = convertView.findViewById(R.id.tvName);
        TextView tvShopName = convertView.findViewById(R.id.tvShopName);
        ImageView imgGood = convertView.findViewById(R.id.imgGood);
        //
        tvName.setText(arrayList.get(i).getName());
        tvShopName.setText((arrayList.get(i).getShopName()));
        imgGood.setImageResource(arrayList.get(i).getImageGood());

        return convertView;
    }
}
