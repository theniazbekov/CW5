package com.example.cw5.data;

import com.example.cw5.models.UserModel1;

import java.util.ArrayList;

public class UserClient1 {
    public static ArrayList<UserModel1> list = new ArrayList<>();

    public static ArrayList<UserModel1> getUserData() {
        list.add(new UserModel1("Android 1"));
        list.add(new UserModel1("Android 2"));
        list.add(new UserModel1("Android 3"));
        list.add(new UserModel1("Android 4"));
        list.add(new UserModel1("Android 5"));
        return list;
    }
}
