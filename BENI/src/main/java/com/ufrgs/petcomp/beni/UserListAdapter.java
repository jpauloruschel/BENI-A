package com.ufrgs.petcomp.beni;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ufrgs.petcomp.database.User;

import java.util.ArrayList;

/**
 * Created by João Paulo T Ruschel on 10/04/2014.
 */

public class UserListAdapter extends BaseAdapter {
    private ArrayList listData;
    private LayoutInflater layoutInflater;
    private Context mContext;

    public UserListAdapter(Context context, ArrayList listData) {
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
            convertView = layoutInflater.inflate(R.layout.frag_users_listelem_user, null);
            holder = new ViewHolder();
            holder.userName = (TextView) convertView.findViewById(R.id.frag_users_listelem_user_tvname);
            holder.imageView = (ImageView) convertView.findViewById(R.id.frag_users_listelem_user_ivimage);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        User userItem = (User) listData.get(position);
        holder.userName.setText(userItem.getName());
        holder.imageView.setImageDrawable(mContext.getResources().getDrawable(R.drawable.ic_launcher));

        return convertView;
    }

    static class ViewHolder {
        TextView userName;
        ImageView imageView;
    }

}