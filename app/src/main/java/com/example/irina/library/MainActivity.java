package com.example.irina.library;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    Button btnAddCat, btnAddAutor, btnAddBook, btnViewBooks;
    MyDB myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAddCat = (Button)findViewById(R.id.btnAddCat);
        btnAddAutor = (Button)findViewById(R.id.btnAddAutor);
        btnAddBook = (Button)findViewById(R.id.btnAddBook);
        btnViewBooks = (Button)findViewById(R.id.btnViewBooks);

        btnAddCat.setOnClickListener(this);
        btnAddAutor.setOnClickListener(this);
        btnAddBook.setOnClickListener(this);
        btnViewBooks.setOnClickListener(this);

        myDB = new MyDB(this);

    }


    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.btnAddCat:
                intent = new Intent(this, AddCategory.class);
                startActivity(intent);
                break;
            case R.id.btnAddAutor:
                intent = new Intent(this, AddAutor.class);
                startActivity(intent);
                break;
            case R.id.btnAddBook:
                intent = new Intent(this, AddBook.class);
                startActivity(intent);
                break;
            case R.id.btnViewBooks:
                intent = new Intent(this, ViewBooks.class);
                startActivity(intent);
                break;
        }
    }
}
