package com.example.activityparks.ui.auth_reg;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.activityparks.databinding.FragmentAuthBinding;
public class Auth_Fragment extends Fragment {

    private FragmentAuthBinding binding;


    public static Auth_Fragment newInstance(){
        Auth_Fragment fragment = new Auth_Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAuthBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}