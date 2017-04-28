package ru.aryukov.storage;

import org.springframework.stereotype.Service;
import ru.aryukov.domain.Account;
import ru.aryukov.storage.interfaces.AccountStorageUtilsInt;


/**
 * Created by oaryukov on 25.04.2017.
 */
@Service
public class AccountStorageUtilsImpl implements AccountStorageUtilsInt{
    private final AccountStorage usersStorage = new AccountStorage();
    private static final String ALPHA_NUMERIC_STRING = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz0123456789";


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

    public String genPassword(){
        int count = 8;
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }

    public boolean checkUser(String login){
        return usersStorage.getStorage().containsKey(login);
    }
}
