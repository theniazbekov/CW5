package com.example.cw5.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.cw5.adapter.UserAdapter3;
import com.example.cw5.data.UserClient3;
import com.example.cw5.databinding.FragmentThirdBinding;
import com.example.cw5.models.UserModel3;

import java.util.ArrayList;

public class ThirdFragment extends Fragment {
    private FragmentThirdBinding binding;
    ArrayList<UserModel3> list = new ArrayList<UserModel3>();
    private UserAdapter3 userAdapter = new UserAdapter3();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentThirdBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initialisation();
        data();

    }


    private void initialisation() {
        list = UserClient3.getUserData();
        userAdapter = new UserAdapter3();
        userAdapter.setData(list);
        binding.recycler.setAdapter(userAdapter);

    }

    private void data() {

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding = null;
    }

}


