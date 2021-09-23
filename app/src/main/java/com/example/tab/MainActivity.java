package com.example.tab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tab;
    ViewPager viewpgr;
//    Button btn_sig;
//    Button btn_log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tab=findViewById(R.id.tab);
        viewpgr=findViewById(R.id.viewpgr);
//        btn_sig=findViewById(R.id.btn_sig);
//        btn_log=findViewById(R.id.btn_log);

        tab.addTab(tab.newTab().setText("Login"));
        tab.addTab(tab.newTab().setText("SignUP"));
        tab.setTabGravity(tab.GRAVITY_FILL);

        final SignLogFragAdap adapter = new SignLogFragAdap(getSupportFragmentManager(),this, tab.getTabCount());
        viewpgr.setAdapter(adapter);
        viewpgr.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tab));

        tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewpgr.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

//        btn_sig.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(MainActivity.this, DashboardActivity.class);
//            }
//        });
//
//        btn_log.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(MainActivity.this, DashboardActivity.class);
//            }
//        });
    }

}