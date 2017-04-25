package ru.aryukov.storage;

import ru.aryukov.User;

/**
 * Created by oaryukov on 25.04.2017.
 */
public class UsersStorageUtils {
    private UsersStorage usersStorage = new UsersStorage();

    public void addUser(User user){
        usersStorage.getUsersStorage().add(user);
    }
}
