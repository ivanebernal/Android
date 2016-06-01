package com.ivanebernal.eventbinding;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.ivanebernal.eventbinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setListeners(new Listeners(binding));
    }

    @BindingAdapter("bind:numberText")
    public static void setNumberText(TextView view, int number){
        view.setText(String.valueOf(number));
    }

    public static class Listeners implements View.OnClickListener{

        private ActivityMainBinding binding;

        public Listeners(ActivityMainBinding binding) {
            this.binding = binding;
        }

        @Override
        public void onClick(View v){
            int number = binding.getNumber();
            binding.setNumber(++number);
        }
    }
}
