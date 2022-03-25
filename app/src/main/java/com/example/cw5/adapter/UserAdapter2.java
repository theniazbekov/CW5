package com.example.cw5.adapter;


import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cw5.databinding.ListHolderTwoBinding;
import com.example.cw5.models.UserModel2;

import java.util.ArrayList;

public class UserAdapter2 extends RecyclerView.Adapter<UserAdapter2.UserHolder> {
    ArrayList<UserModel2> list = new ArrayList<>();

    @NonNull
    @Override
    public UserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserHolder(ListHolderTwoBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
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
    public void setData(ArrayList<UserModel2> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    public class UserHolder extends RecyclerView.ViewHolder {
        private ListHolderTwoBinding binding;

        public UserHolder(@NonNull ListHolderTwoBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(UserModel2 userModel) {
            binding.imAvatar.setImageResource(userModel.getAvatar());
        }
    }
}
