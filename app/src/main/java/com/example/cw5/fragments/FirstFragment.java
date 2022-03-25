package com.example.cw5.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.cw5.adapter.UserAdapter1;
import com.example.cw5.data.UserClient1;
import com.example.cw5.databinding.FragmentFirstBinding;
import com.example.cw5.models.UserModel1;

import java.util.ArrayList;

public class FirstFragment extends Fragment {
    private FragmentFirstBinding binding;
    ArrayList<UserModel1> list = new ArrayList<UserModel1>();
    private UserAdapter1 userAdapter = new UserAdapter1();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initialisation();
        data();

    }


    private void initialisation() {
        list = UserClient1.getUserData();
        userAdapter = new UserAdapter1();
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


