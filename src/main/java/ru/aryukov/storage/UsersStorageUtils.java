package ru.aryukov.storage;

import ru.aryukov.User;



/**
 * Created by oaryukov on 25.04.2017.
 */
public class UsersStorageUtils {
    private UsersStorage usersStorage = new UsersStorage();

    public void addUser(User user){
        if (!checkUser(user.getLogin())) {
            usersStorage.getStorage().put(user.getLogin(), user);
        }
    }

    public User getUser(String login){
        User user = null;
        if(checkUser(login)){
            user = usersStorage.getStorage().get(login);
        }
        return user;
    }

    public boolean checkUser(String login){
        return usersStorage.getStorage().containsKey(login);
    }
}
