package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.BundleCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class HistoryActivity extends AppCompatActivity {

    TextView historyText;
    ListView listView;
    List<String> resultList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        Bundle bundle = getIntent().getExtras();

        resultList = bundle.getStringArrayList("New Last");
        listView = findViewById(R.id.lisView);
        ArrayAdapter<String> items = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, resultList);
        listView.setAdapter(items);

        listView.setOnItemClickListener(this::onItemClick);
    }

    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        String str = resultList.get(position).toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("message", str);
        startActivity(intent);

        System.out.println("Hello  " + str + "  Hello");
    }
}
