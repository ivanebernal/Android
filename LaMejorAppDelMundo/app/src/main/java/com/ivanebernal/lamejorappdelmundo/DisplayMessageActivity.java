package com.ivanebernal.lamejorappdelmundo;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class DisplayMessageActivity extends AppCompatActivity implements MyFragment.OnFragmentInteractionListener, ChangedFragment.OnFragmentInteractionListener{

    public static ArrayList<String> fragmentList = new ArrayList<>();

    ChangedFragment changedFragment = new ChangedFragment();
    String ARG_PARAM1 = "com.ivanebernal.lamejorappdelmundo.arraylist";

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
        Bundle args = new Bundle();
        args.putStringArrayList(ARG_PARAM1, fragmentList);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        try {
            changedFragment.setArguments(args);
            transaction.replace(R.id.fragment_view, changedFragment);
            transaction.addToBackStack(null);

            transaction.commit();

        }catch(Exception e){
            //ignore
        }

    }

    @Override
    public void onChangedFragmentInteraction(ArrayList<String> list) {

    }

    @Override
    public void onMyFragmentInteraction(ArrayList<String> list) {

    }

    @Override
    public void onCreateMyFragment() {

    }
}
