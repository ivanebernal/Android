package com.ivanebernal.lamejorappdelmundo;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity implements MyFragment.OnFragmentInteractionListener, ChangedFragment.OnFragmentInteractionListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MyActivity.EXTRA_MESSAGE);

        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        LinearLayout layout = (LinearLayout) findViewById(R.id.content);
        layout.addView(textView);

        if(findViewById(R.id.fragment_view) != null){
            if(savedInstanceState != null) return;

            MyFragment firstFragment = new MyFragment();
            firstFragment.setArguments(getIntent().getExtras());

            getSupportFragmentManager().beginTransaction().add(R.id.fragment_view, firstFragment).commit();

        }


    }

    public void changeFragment(View view){
        ChangedFragment changedFragment = new ChangedFragment();
        Bundle args = new Bundle();
        changedFragment.setArguments(args);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        transaction.replace(R.id.fragment_view, changedFragment);
        transaction.addToBackStack(null);

        transaction.commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
