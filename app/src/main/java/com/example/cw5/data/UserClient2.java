package com.example.cw5.data;

import com.example.cw5.R;
import com.example.cw5.models.UserModel2;

import java.util.ArrayList;

public class UserClient2 {
    public static ArrayList<UserModel2> list = new ArrayList<>();

    public static ArrayList<UserModel2> getUserData() {
        list.add(new UserModel2(R.drawable.ic_launcher_foreground));
        list.add(new UserModel2(R.drawable.ic_launcher_foreground));
        list.add(new UserModel2(R.drawable.ic_launcher_foreground));
        list.add(new UserModel2(R.drawable.ic_launcher_foreground));
        list.add(new UserModel2(R.drawable.ic_launcher_foreground));

        return list;
    }
}

