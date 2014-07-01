package com.ufrgs.petcomp.database;

import java.util.ArrayList;

/**
 * Created by João Paulo T Ruschel on 10/04/2014.
 */
public class UserDatabase {
    private ArrayList<User> dataList;

    public UserDatabase() {
        dataList = new ArrayList<User>();
    }

    public void addData(User user) {
        dataList.add(user);
    }

    public ArrayList<User> getDataList() {
        return dataList;
    }

    public User getUser(int id) {
        return dataList.get(id);
    }
}
