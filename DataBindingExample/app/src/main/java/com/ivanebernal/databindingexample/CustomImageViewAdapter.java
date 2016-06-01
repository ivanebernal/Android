package com.ivanebernal.databindingexample;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by ivan on 25/05/16.
 */
public class CustomImageViewAdapter {

    private static Picasso picasso;

    @BindingAdapter("imageUrl")
    public static void setImage(ImageView view, String imageUrl){
        Picasso picasso = getPicasso(view.getContext());
        picasso.load(imageUrl).into(view);
    }

    @BindingAdapter({"imageUrl", "imagePlaceholder", "imageError"})
    public static void setImage(ImageView view, String imageUrl, Drawable imagePlaceholder, Drawable imageError){
        Picasso picasso = getPicasso(view.getContext());
        picasso.load(imageUrl)
                .placeholder(imagePlaceholder)
                .error(imageError)
                .into(view);
    }

    private static Picasso getPicasso(Context context) {
        if(picasso ==  null){
            picasso = Picasso.with(context);
        }
        return picasso;
    }
}
