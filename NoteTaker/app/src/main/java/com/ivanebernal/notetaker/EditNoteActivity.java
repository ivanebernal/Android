package com.ivanebernal.notetaker;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class EditNoteActivity extends AppCompatActivity {

    public static final int RESULT_DELETE = -500;
    private boolean isInEditMode = true;
    private boolean isAddingNote = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_note);

        final Button saveButton = (Button)findViewById(R.id.saveButton);
        final Button cancelButton = (Button)findViewById(R.id.cancelButton);
        final EditText titleEditText = (EditText) findViewById(R.id.titleEditText);
        final EditText noteEditText = (EditText) findViewById(R.id.noteEditText);
        final TextView dateTextView = (TextView) findViewById(R.id.dateTextView);

        Serializable extra = getIntent().getSerializableExtra("Note");

        if(extra != null){
            Note note = (Note) extra;
            titleEditText.setText(note.getTitle());
            noteEditText.setText(note.getNote());

            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            String date = dateFormat.format(note.getDate());
            dateTextView.setText(date);

            isInEditMode = false;
            titleEditText.setEnabled(false);
            noteEditText.setEnabled(false);
            saveButton.setText("Edit");

            isAddingNote = false;
        }

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(RESULT_CANCELED, new Intent());
                finish();
            }
        });

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(isInEditMode){
                    isInEditMode = false;
                    saveButton.setText("Edit");
                    titleEditText.setEnabled(false);
                    noteEditText.setEnabled(false);

                    TextView dateTextView = (TextView) findViewById(R.id.dateTextView);
                    DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyy HH:mm:ss");
                    String date = dateFormat.format(Calendar.getInstance().getTime());
                    dateTextView.setText(date);

                    Intent returnIntent = new Intent();
                    Note note = new Note(titleEditText.getText().toString(),
                            noteEditText.getText().toString(),
                            Calendar.getInstance().getTime());
                    returnIntent.putExtra("Note", note);
                    setResult(RESULT_OK, returnIntent);
                    finish();
                }else{
                    isInEditMode = true;
                    saveButton.setText("Save");
                    titleEditText.setEnabled(true);
                    noteEditText.setEnabled(true);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        if(isAddingNote){
            menu.removeItem(R.id.delete_note);
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(R.string.delete_confirm);
        builder.setTitle(R.string.delete_title);
        builder.setPositiveButton("Delete", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent returnIntent = new Intent();
                setResult(RESULT_DELETE, returnIntent);
                finish();
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        builder.create().show();
        return true;
    }

}
