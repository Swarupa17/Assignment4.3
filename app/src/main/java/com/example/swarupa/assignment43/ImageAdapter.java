package com.example.swarupa.assignment43;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.swarupa.assignment43.R;

/**
 * Created by swarupa on 28-11-2016.
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    public Integer [] mImage =  {R.drawable.pic,
            R.drawable.pic1,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic2,
            R.drawable.pic5};
    public ImageAdapter(Context c)
    {
        mContext = c;
    }
    @Override
    public int getCount() {
        return mImage.length;
    }

    @Override
    public Object getItem(int i) {
        return mImage[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView ;
        if(view == null)
        {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(300,300));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8,8,8,8);

        }
        else
        {
            imageView = (ImageView)view;
        }
        imageView.setImageResource(mImage[i]);
        return imageView;
    }
}
