package com.ivanebernal.databindingexample;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ivanebernal.databindingexample.databinding.ActivityMainBinding;
import com.ivanebernal.databindingexample.databinding.FragmentDataBinding;

/**
 * Created by ivan on 23/05/16.
 */
public class DataFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        FragmentDataBinding binding = FragmentDataBinding.inflate(inflater, container, false);

        DataSource dataSource = DataSource.get("Fragment Binding");

        binding.setDataSource(dataSource);

        return binding.getRoot();
    }
}
