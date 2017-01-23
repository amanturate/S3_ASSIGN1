package com.example.turate.s3_assign1;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText mtextSearch;
    Button msearch;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtextSearch = (EditText) findViewById(R.id.et1);
        msearch = (Button) findViewById(R.id.btn1);

        msearch.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     search();
                 }
        });
    }

    private void search(){
        text = mtextSearch.getText().toString();
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        intent.putExtra(SearchManager.QUERY, text);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}