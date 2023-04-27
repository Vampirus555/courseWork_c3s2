package com.example.activityparks.ui.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.activityparks.ui.auth_reg.Auth_Fragment;
import com.example.activityparks.ui.auth_reg.Reg_Fragment;

public class AuthRegAdapter extends FragmentStateAdapter {
    public AuthRegAdapter(FragmentActivity fragmentActivity){
        super(fragmentActivity);
    }

    @NonNull

    @Override
    public Fragment createFragment(int position){
        if(position == 0)
            return Auth_Fragment.newInstance();
        return(Reg_Fragment.newInstance(position));
    }

    @Override
    public int getItemCount(){
        return 2;
    }
}
