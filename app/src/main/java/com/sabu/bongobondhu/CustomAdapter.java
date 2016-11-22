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

class CustomAdapter extends ArrayAdapter<String> {
    public CustomAdapter(Context context, String[] items) {
        super(context,R.layout.custom_raw ,items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater sabuInflat = LayoutInflater.from(getContext());
        View customView = sabuInflat.inflate(R.layout.custom_raw,parent,false);

        int[] image = new int[]{R.drawable.file_pen_write,R.drawable.mic,R.drawable.album,R.drawable.message,R.drawable.onecomment,R.drawable.comments,R.drawable.about};
        String singleItem = getItem(position);
        TextView textView = (TextView) customView.findViewById(R.id.textView19);
        ImageView imageView = (ImageView) customView.findViewById(R.id.imageView11);
        ImageView imageView1 = (ImageView) customView.findViewById(R.id.imageView12);

        for(int i=0;i<=position;i++){
            textView.setText(singleItem);
            imageView.setImageResource(image[i]);
            imageView1.setImageResource(R.drawable.forward);
        }
        return  customView;
    }
}
