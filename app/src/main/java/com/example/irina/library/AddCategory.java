package com.example.irina.library;

import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class AddCategory extends Activity implements View.OnClickListener {

    Button btnAddCatToDB, btnCancelCat;
    EditText etAddCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_category);
        etAddCat = (EditText)findViewById(R.id.etAddCat);
        btnAddCatToDB = (Button)findViewById(R.id.btnAddCatToDB);
        btnCancelCat = (Button)findViewById(R.id.btnCancelCat);

        btnCancelCat.setOnClickListener(this);
        btnAddCatToDB.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        ContentValues cv  = new ContentValues();
        String name = etAddCat.getText().toString();

    }
}
