package com.ivanebernal.databindingexample;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import com.ivanebernal.databindingexample.databinding.DataViewBinding;

/**
 * Created by ivan on 23/05/16.
 */
public class DataView extends FrameLayout {
    private DataViewBinding binding;

    public DataView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        binding = DataBindingUtil.bind(this);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        DataSource dataSource = DataSource.get("Data View");
        binding.setDataSource(dataSource);
    }
}
