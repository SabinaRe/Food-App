package com.example.tab;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

public class DashboardActivity extends AppCompatActivity {
    BottomNavigationView btm_nav;
    TabLayout dash_tab;
    ViewPager dash_view_pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btm_nav=findViewById(R.id.btm_nav);
        btm_nav.setSelectedItemId(R.id.home);

        dash_tab = findViewById(R.id.dash_tab);
        dash_view_pager = findViewById(R.id.dash_view_pager);

        dash_tab.addTab(dash_tab.newTab().setText("Foods"));
        dash_tab.addTab(dash_tab.newTab().setText("Drinks"));
        dash_tab.addTab(dash_tab.newTab().setText("Snacks"));
        dash_tab.addTab(dash_tab.newTab().setText("Soups"));
        dash_tab.addTab(dash_tab.newTab().setText("Sausages"));
        dash_tab.setTabGravity(TabLayout.GRAVITY_FILL);

        btm_nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment=null;
                Activity actvity=null;
                switch (item.getItemId()){
                    case R.id.home:
                        actvity = new DashboardActivity();
                        break;

                    case R.id.fav:
                        fragment = new FavFragment();
                        break;

                    case R.id.prof:
                        fragment = new ProfileFragment();
                        break;

                    case R.id.histry:
                        fragment = new HistryFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.dash_container, fragment).commit();
                return true;
            }
        });
        final FoodPagerAdapter adapter = new FoodPagerAdapter(getSupportFragmentManager(), dash_tab.getTabCount());
        dash_view_pager.setAdapter(adapter);
        dash_view_pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(dash_tab));

        dash_tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
               dash_view_pager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }
}