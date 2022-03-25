package com.example.cw5.data;

import com.example.cw5.models.UserModel3;

import java.util.ArrayList;

public class UserClient3 {
    public static ArrayList<UserModel3> list = new ArrayList<>();

    public static ArrayList<UserModel3> getUserData() {
        list.add(new UserModel3("+996554234957"));
        list.add(new UserModel3("+996554734029"));
        list.add(new UserModel3("+996554320448"));
        list.add(new UserModel3("+996554231443"));
        list.add(new UserModel3("+996554893375"));
        return list;
    }
}
