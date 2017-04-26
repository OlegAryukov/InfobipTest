package ru.aryukov.storage;

import ru.aryukov.domain.Account;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by oaryukov on 25.04.2017.
 */

class UsersStorage {
    private HashMap<String, Account> storage = new HashMap<>();

    public Map<String, Account> getStorage(){
        return this.storage;
    }
}
