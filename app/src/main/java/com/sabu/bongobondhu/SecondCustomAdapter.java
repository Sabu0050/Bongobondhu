package com.sabu.bongobondhu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by devil on 02-Aug-16.
 */
class SecondCustomAdapter extends ArrayAdapter<String> {
    public SecondCustomAdapter(Context context, String[] item) {
        super(context,R.layout.custom_second_row,item);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater sabuInflat = LayoutInflater.from(getContext());
        View customListView = sabuInflat.inflate(R.layout.custom_second_row, parent, false);
        String singleItem = getItem(position);

        TextView textView = (TextView) customListView.findViewById(R.id.textView20);
        ImageView imageView = (ImageView) customListView.findViewById(R.id.imageView13);

        for(int i=0;i<=position;i++) {
            textView.setText(singleItem);
            imageView.setImageResource(R.drawable.forward);
        }
        return customListView;
    }
}
