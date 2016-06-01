package com.ivanebernal.databindingexample;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.net.Uri;
import android.support.v4.app.ActivityManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.ivanebernal.databindingexample.databinding.ActivityMainBinding;
import com.ivanebernal.databindingexample.databinding.DataViewBinding;
import com.ivanebernal.databindingexample.databinding.ExpressionsBinding;
import com.ivanebernal.databindingexample.databinding.ItemViewBinding;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        DataSource dataSource = DataSource.get("Iván");
        DataSource includeSource = DataSource.get("Nearsoft");


        binding.setDataSource(dataSource);
        binding.setIncludeSource(includeSource);

        binding.list.setLayoutManager(new LinearLayoutManager(this));
        binding.list.setAdapter(new DataSourceAdapter(getLayoutInflater()));

        ExpressionsBinding raspberryBinding = ExpressionsBinding.inflate(getLayoutInflater(), binding.menu, false);
        raspberryBinding.setItem(new MenuItem(false, "Raspberry", "$2.99", 2));
        binding.menu.addView(raspberryBinding.getRoot());

        ExpressionsBinding vanillaSpecialBinding = ExpressionsBinding.inflate(getLayoutInflater(), binding.menu, false);
        vanillaSpecialBinding.setItem(new MenuItem(true, "Vanilla", "$0.99", 1));
        binding.menu.addView(vanillaSpecialBinding.getRoot());

        binding.setImageUrl("https://developer.android.com/assets/images/android_logo.png");

        TextView textView = new TextView(this);
        textView.setText(String.valueOf(0));
    }

    private class DataSourceAdapter extends RecyclerView.Adapter<ViewHolder> {
        private LayoutInflater layoutInflater;

        public DataSourceAdapter(LayoutInflater layoutInflater) {

            this.layoutInflater = layoutInflater;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            ItemViewBinding binding = ItemViewBinding.inflate(layoutInflater, parent, false);
            return new ViewHolder(binding.getRoot());
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            DataSource dataSource = DataSource.get("Item Binding" + position);
            ItemViewBinding binding = DataBindingUtil.getBinding(holder.itemView);
            binding.setDataSource(dataSource);
        }

        @Override
        public int getItemCount() {
            return 10;
        }
    }
    private class ViewHolder extends RecyclerView.ViewHolder{
        public ViewHolder(View itemView){
            super(itemView);
        }
    }
}
