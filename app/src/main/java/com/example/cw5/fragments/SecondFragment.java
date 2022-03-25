package com.example.cw5.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.cw5.adapter.UserAdapter2;
import com.example.cw5.data.UserClient2;
import com.example.cw5.databinding.FragmentSecondBinding;
import com.example.cw5.models.UserModel2;

import java.util.ArrayList;

public class SecondFragment extends Fragment {
    private FragmentSecondBinding binding;
    ArrayList<UserModel2> list = new ArrayList<UserModel2>();
    private UserAdapter2 userAdapter = new UserAdapter2();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initialisation();
        data();

    }


    private void initialisation() {
        list = UserClient2.getUserData();
        userAdapter = new UserAdapter2();
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



