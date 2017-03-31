package com.swpuiot.yikao.data;

import android.content.Context;
import android.widget.ImageView;

import com.youth.banner.loader.ImageLoader;

/**
 * Created by 羊荣毅_L on 2017/3/31.
 */
public class BannerLoader extends ImageLoader {
    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        int imageId = (int) path;
        imageView.setImageResource(imageId);
    }
}
