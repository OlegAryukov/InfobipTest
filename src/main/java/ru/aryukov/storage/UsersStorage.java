package ru.aryukov.storage;

import ru.aryukov.User;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by oaryukov on 25.04.2017.
 */

class UsersStorage {
    private HashMap<String, User> storage = new HashMap<>();

    public Map<String, User> getStorage(){
        return this.storage;
    }
}
