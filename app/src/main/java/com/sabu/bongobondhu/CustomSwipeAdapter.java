package com.sabu.bongobondhu;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by devil on 02-Aug-16.
 */

public class CustomSwipeAdapter extends PagerAdapter {

    private int[] image_resource = {R.drawable.b1,R.drawable.b2,R.drawable.b3,R.drawable.b4,R.drawable.b5,R.drawable.b6,R.drawable.b7,
                                    R.drawable.b8,R.drawable.b9,R.drawable.b10,R.drawable.b11,R.drawable.b12,R.drawable.b13,R.drawable.b14,
                                    R.drawable.b15,R.drawable.b16,R.drawable.b17,R.drawable.b18,R.drawable.b19,R.drawable.b20,R.drawable.b21,
                                    R.drawable.b22,R.drawable.b23,R.drawable.b24,R.drawable.b25,R.drawable.b26,R.drawable.b27,R.drawable.b28,
                                    R.drawable.b29,R.drawable.b30,R.drawable.b31,R.drawable.b32,R.drawable.b33,R.drawable.b34,R.drawable.b35,
                                    R.drawable.b36,R.drawable.b37,R.drawable.b38,R.drawable.b39,R.drawable.b40,R.drawable.b41,R.drawable.b42,
                                    R.drawable.b43,R.drawable.b44,R.drawable.b45,R.drawable.b46,R.drawable.b47,R.drawable.b48,
                                    R.drawable.b49,R.drawable.b50,R.drawable.b51,R.drawable.b52,R.drawable.b53,R.drawable.b54,R.drawable.b55,
                                    R.drawable.b56,R.drawable.b57,R.drawable.b58,R.drawable.b59,R.drawable.b60,R.drawable.b61,R.drawable.b62,
                                    R.drawable.b63,R.drawable.b65,R.drawable.b66,R.drawable.b67,R.drawable.b68,R.drawable.b69,R.drawable.b70,R.drawable.b71,
            R.drawable.b72,R.drawable.b73,R.drawable.b74,R.drawable.b75,R.drawable.b76,R.drawable.b77,R.drawable.b78,R.drawable.b79,R.drawable.b80,
            R.drawable.b81,R.drawable.b82,R.drawable.b83,R.drawable.b84,R.drawable.b85,R.drawable.b86,R.drawable.b87,R.drawable.b88,R.drawable.b89,
            R.drawable.b90,R.drawable.b91,R.drawable.b92,R.drawable.b93,R.drawable.b94};
    private Context ctx;
    private LayoutInflater layoutInflater;


    public CustomSwipeAdapter(Context ctx){
        this.ctx = ctx;
    }
    @Override
    public int getCount() {
        return image_resource.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflater.inflate(R.layout.swaip_layout,container,false);
        ImageView imageView = (ImageView) item_view.findViewById(R.id.image_gallary);
        imageView.setImageResource(image_resource[position]);
        container.addView(item_view);

        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}
