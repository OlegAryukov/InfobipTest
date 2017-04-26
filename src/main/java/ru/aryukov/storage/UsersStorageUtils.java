package ru.aryukov.storage;

import ru.aryukov.domain.Account;


/**
 * Created by oaryukov on 25.04.2017.
 */
public class UsersStorageUtils {
    private UsersStorage usersStorage = new UsersStorage();

    public Account addUser(Account account){
        return usersStorage.getStorage().put(account.getLogin(), account);
    }

    public Account getUser(String login){
        Account account = null;
        if(checkUser(login)){
            account = usersStorage.getStorage().get(login);
        }
        return account;
    }

    public boolean checkUser(String login){
        return usersStorage.getStorage().containsKey(login);
    }
}
