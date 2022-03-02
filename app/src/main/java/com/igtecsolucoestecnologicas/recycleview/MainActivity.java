package com.igtecsolucoestecnologicas.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.igtecsolucoestecnologicas.recycleview.Model.Emails;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rc;

    private EmailAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new EmailAdapter(new ArrayList<>(Emails.fakeEmails()));

        rc = findViewById(R.id.rcv_main);
        rc.setAdapter(adapter);
    }
}