package com.example.cw5.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.cw5.databinding.ListHolderOneBinding;
import com.example.cw5.models.UserModel1;

import java.util.ArrayList;

public class UserAdapter1 extends RecyclerView.Adapter<UserAdapter1.UserHolder> {
    ArrayList<UserModel1> list = new ArrayList<>();

    @NonNull
    @Override
    public UserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserHolder(ListHolderOneBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }


    @Override
    public void onBindViewHolder(@NonNull UserHolder holder, int position) {
        holder.onBind(list.get(position));
    }


    @Override
    public int getItemCount() {
        return list.size();

    }

    @SuppressLint("NotifyDataSetChanged")
    public void setData(ArrayList<UserModel1> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    public class UserHolder extends RecyclerView.ViewHolder {
        private ListHolderOneBinding binding;

        public UserHolder(@NonNull ListHolderOneBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(UserModel1 userModel) {

            binding.tvName.setText(userModel.getName());
        }
    }
}

