package com.ufrgs.petcomp.beni;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ufrgs.petcomp.database.BTestInfo;

import java.util.ArrayList;

/**
 * Created by João Paulo T Ruschel on 10/04/2014.
 */

public class TestListAdapter extends BaseAdapter {
    private ArrayList listData;
    private LayoutInflater layoutInflater;
    private Context mContext;

    public TestListAdapter(Context context, ArrayList listData) {
        this.listData = listData;
        layoutInflater = LayoutInflater.from(context);
        mContext = context;
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.frag_users_listelem_test, null);
            holder = new ViewHolder();
            holder.userName = (TextView) convertView.findViewById(R.id.frag_users_listelem_test_tvname);
            holder.imageView = (ImageView) convertView.findViewById(R.id.frag_users_listelem_test_ivimage);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        BTestInfo testItem = (BTestInfo) listData.get(position);
        holder.userName.setText(testItem.getName());
        holder.imageView.setImageDrawable(mContext.getResources().getDrawable(R.drawable.ic_launcher));

        return convertView;
    }

    static class ViewHolder {
        TextView userName;
        ImageView imageView;
    }

}