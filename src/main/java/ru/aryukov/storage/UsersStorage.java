package ru.aryukov.storage;

import ru.aryukov.User;

import java.util.ArrayList;

/**
 * Created by oaryukov on 25.04.2017.
 */
class UsersStorage {
    private ArrayList<User> usersStorage = new ArrayList<>();

    public ArrayList<User> getUsersStorage(){
        return this.usersStorage;
    }
}
