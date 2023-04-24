package com.example.activityparks;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

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
