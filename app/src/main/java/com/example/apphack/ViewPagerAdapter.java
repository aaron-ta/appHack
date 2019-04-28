package com.example.apphack;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ViewPagerAdapter extends PagerAdapter {
    Context context;
    private int[] GalImages = new int[] { R.drawable.barra_menu,
            R.drawable.btn_adj, R.drawable.campo_1, R.drawable.pass_ico};

    String[] GalImagesStr = {
            "http://www.website.com/images/image01.png",
            "http://www.website.com/images/image02.png",
            "http://www.website.com/images/image03.png",
            "http://www.website.com/images/image04.png"};


    ViewPagerAdapter (Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return GalImagesStr.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((ImageView) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = new ImageView(context);
        //int padding = context.getResources().getDimensionPixelSize(
        //        R.dimen.padding_medium);
        //imageView.setPadding(padding, padding, padding, padding);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        //--- here's where the problem is:
        imageView.setImageResource(GalImages[position]);
        ((ViewPager) container).addView(imageView, 0);
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((ImageView) object);
    }
}