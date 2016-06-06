package com.ivanebernal.lamejorappdelmundo;

import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.ivanebernal.lamejorappdelmundo.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setGravity(Gravity.CENTER);

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) textView.setText(R.string.version_check_ok);
        else textView.setText(R.string.version_check_fail);

        LinearLayout layout = (LinearLayout) findViewById(R.id.layout_main);
        layout.addView(textView);
    }

    /*@Override
    protected void onStart() {
        super.onStart();

        LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        boolean gpsEnabled = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
    }*/

    /*    @Override
    protected void onResume() {
        super.onResume();
        EditText editText = (EditText) findViewById(R.id.edit_message);
        editText.setHint(R.string.resume);
    }*/

    /*@Override
    protected void onPause() {
        super.onPause();
        EditText editText = (EditText) findViewById(R.id.edit_message);
        editText.setHint(R.string.resume);

    }*/

    @Override
    protected void onRestart() {
        super.onRestart();
        EditText editText = (EditText) findViewById(R.id.edit_message);
        editText.setHint(R.string.resume);

    }

    //Called when user clicks send button
    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
