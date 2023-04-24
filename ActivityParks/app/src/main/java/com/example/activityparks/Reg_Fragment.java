package com.example.activityparks;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.activityparks.databinding.FragmentRegBinding;
public class Reg_Fragment extends Fragment {
    public int target;
    private FragmentRegBinding binding;


    public static Reg_Fragment newInstance(int position){
        Reg_Fragment fragment = new Reg_Fragment();
        Bundle args = new Bundle();
        args.putInt("target", position);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        target = getArguments() != null ? getArguments().getInt("target") : 1;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentRegBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }
}