package com.ivanebernal.databindingexample;

import android.databinding.BindingAdapter;
import android.widget.TextView;

/**
 * Created by ivan on 25/05/16.
 */
public class TextViewBindingAdapter {

    @BindingAdapter("numberText")
    public static void setNumberText(TextView view, int number){
        view.setText(String.valueOf(number));
    }
}
