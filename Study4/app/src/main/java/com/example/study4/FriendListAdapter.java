package com.example.study4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Win7 on 2018-04-28.
 */

public class FriendListAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private ArrayList<FriendList> items;
    private int layout;

    public FriendListAdapter(Context context, int layout, ArrayList<FriendList> items) {
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.items = items;
        this.layout = layout;
    }
    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // number of data is 0
        if (convertView == null) {
            convertView = inflater.inflate(layout, parent, false);
        }

        FriendList friendList = items.get(position);

        // set data into each item layout
        ImageView profile = (ImageView) convertView.findViewById(R.id.profile);
        TextView name = (TextView) convertView.findViewById(R.id.name);
        TextView textBox = (TextView) convertView.findViewById(R.id.textBox);

        profile.setImageResource(friendList.getProfile());
        name.setText(friendList.getName());
        textBox.setText(friendList.getTextBox());

        return convertView;
    }
}
