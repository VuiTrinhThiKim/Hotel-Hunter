package com.example.hotelhunter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.hotelhunter.ui.list_for_rent.ListForRentFragment;
import com.example.hotelhunter.ui.map.MapFragment;
import com.example.hotelhunter.ui.add_for_rent.AddForRentFragment;
import com.google.android.libraries.places.api.Places;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.viewpager2.widget.ViewPager2;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    private ViewPager2 viewPager2;
    MapFragment mapFragment;
    ListForRentFragment listForRentFragment;
    AddForRentFragment addForRentFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_map, R.id.navigation_list_for_rent, R.id.navigation_add_for_rent)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);

    }
        /*viewPager2 = findViewById(R.id.viewpager2);
        bottomNavigationView = findViewById(R.id.nav_view);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        viewPager2.setCurrentItem(0, false);
                        break;
                    case R.id.navigation_dashboard:
                        viewPager2.setCurrentItem(1, false);
                        break;
                    case R.id.navigation_notifications:
                        viewPager2.setCurrentItem(2, false);
                }
                return false;
            }
        });

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
                switch (position) {
                    case 0:
                        bottomNavigationView.getMenu().findItem(R.id.navigation_home).setChecked(true);
                        break;
                    case 1:
                        bottomNavigationView.getMenu().findItem(R.id.navigation_dashboard).setChecked(true);
                        break;
                    case 2:
                        bottomNavigationView.getMenu().findItem(R.id.navigation_notifications).setChecked(true);
                        break;
                }
            }
        });


        setupViewPager(viewPager2);
    }

    private void setupViewPager(ViewPager2 viewPager) {

        ViewPageAdapter pageAdapter = new ViewPageAdapter(getSupportFragmentManager(), getLifecycle());
        homeFragment = new HomeFragment();
        dashboardFragment = new DashboardFragment();
        notificationsFragment = new NotificationsFragment();

        pageAdapter.addFragment(homeFragment);
        pageAdapter.addFragment(dashboardFragment);
        pageAdapter.addFragment(notificationsFragment);

        viewPager.setAdapter(pageAdapter);
    }*/


}