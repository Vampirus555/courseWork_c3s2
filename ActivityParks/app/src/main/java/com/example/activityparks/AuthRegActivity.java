package com.example.activityparks;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.activityparks.databinding.ActivityAuthRegBinding;
import com.example.activityparks.ui.Adapters.AuthRegAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import android.os.Bundle;
import android.view.View;

public class AuthRegActivity extends AppCompatActivity {
    private ActivityAuthRegBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAuthRegBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        FragmentStateAdapter pageAdapter = new AuthRegAdapter(this);
        binding.pager.setAdapter(pageAdapter);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(binding.tabLayout,
                binding.pager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                if(position == 0)
                    tab.setText("Авторизация");
                else if (position ==1)
                    tab.setText("Регистрация");
            }
        });
        tabLayoutMediator.attach();
    }
}