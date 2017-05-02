package com.ly.example.myapplication2.utils.widgets;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.ly.example.myapplication2.R;
import com.ly.example.myapplication2.utils.widgets.glide.GlideCircleTransform;
import com.ly.example.myapplication2.utils.widgets.glide.GlideRoundTransform;

import java.io.File;

public class ImageLoader {

    public static void loadImage(Context context, String url, int erroImg, int emptyImg, ImageView iv) {
        //原生 API
        Glide.with(context).load(url).placeholder(emptyImg).error(erroImg).into(iv);
    }

    public static void loadImage(Context context, String url, ImageView iv) {
        //原生 API
        Glide.with(context).load(url).crossFade().placeholder(R.drawable.image_small_default).error(R.drawable
                .image_small_default)
                .into(iv);
    }

    public static void loadGifImage(Context context, String url, ImageView iv) {
        Glide.with(context).load(url).asGif().diskCacheStrategy(DiskCacheStrategy.SOURCE).placeholder(R.drawable
                .image_small_default).error(R.drawable.image_small_default).into(iv);
    }


    public static void loadCircleImage(Context context, String url, ImageView iv) {
        Glide.with(context).load(url).placeholder(R.drawable.image_small_default).error(R.drawable
                .image_small_default).transform(new
                GlideCircleTransform(context)).into(iv);
    }

    public static void loadRoundCornerImage(Context context, String url, ImageView iv) {
        Glide.with(context).load(url).placeholder(R.drawable.image_small_default).error(R.drawable
                .image_small_default).transform(new
                GlideRoundTransform(context, 10)).into(iv);
    }


    public static void loadImage(Context context, final File file, final ImageView imageView) {
        Glide.with(context)
                .load(file)
                .into(imageView);


    }

    public static void loadImage(Context context, final int resourceId, final ImageView imageView) {
        Glide.with(context)
                .load(resourceId)
                .into(imageView);
    }
}