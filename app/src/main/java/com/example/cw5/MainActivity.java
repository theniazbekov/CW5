package com.example.cw5;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.cw5.databinding.ActivityMainBinding;
import com.example.cw5.fragments.FirstFragment;
import com.example.cw5.fragments.SecondFragment;
import com.example.cw5.fragments.ThirdFragment;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private BottomNavigationItemView bottomNavigationItemView;
    private FragmentManager manager;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        manager = getSupportFragmentManager();
        if ((savedInstanceState == null)) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container_fragment, FirstFragment.class, null)
                    .commit();
        }
        binding.bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                switch (item.getItemId()) {
                    case R.id.firstFragment:
                        transaction.replace(R.id.container_fragment, new FirstFragment());
                        transaction.addToBackStack("FirstFragment");
                        transaction.commit();
                        item.setChecked(true);
                        break;
                    case R.id.secondFragment:
                        transaction.replace(R.id.container_fragment, new SecondFragment());
                        transaction.addToBackStack("SecondFragment");
                        transaction.commit();
                        item.setChecked(true);
                        break;
                    case R.id.thirdFragment:
                        transaction.replace(R.id.container_fragment, new ThirdFragment());
                        transaction.addToBackStack("ThirdFragment");
                        transaction.commit();
                        item.setChecked(true);
                        break;
                }
                return false;
            }
        });
    }


}