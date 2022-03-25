package com.example.cw5.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cw5.databinding.ListHolderThirdBinding;
import com.example.cw5.models.UserModel3;

import java.util.ArrayList;

public class UserAdapter3 extends RecyclerView.Adapter<UserAdapter3.UserHolder> {
    ArrayList<UserModel3> list = new ArrayList<>();

    @NonNull
    @Override
    public UserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserHolder(ListHolderThirdBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
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
    public void setData(ArrayList<UserModel3> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    public class UserHolder extends RecyclerView.ViewHolder {
        private ListHolderThirdBinding binding;

        public UserHolder(@NonNull ListHolderThirdBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(UserModel3 userModel) {
            binding.tvName.setText(userModel.getName());
        }
    }
}

