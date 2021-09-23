package com.example.tab;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class DailogFragment extends AppCompatActivity {  ///CREATE ACTIVITY INSTEAD TO USE ON BACK PRESS
    TextView cancel;
    Button procd_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dailog_frag);

        cancel = findViewById(R.id.cancel);
        procd_btn = findViewById(R.id.procd_btn);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        procd_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DailogFragment.this, PaymentActivity.class);
                startActivity(intent);
            }
        });
    }
}
