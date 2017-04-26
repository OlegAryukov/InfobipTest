package ru.aryukov.services;

import ru.aryukov.domain.Account;

import java.util.Map;

/**
 * Created by oaryukov on 25.04.2017.
 */
public class UserStatService {
    private Account account;

    public UserStatService(Account account){
        this.account = account;
    }

    public void changeStat(String longURL){
        if(account.getStatistic().containsKey(longURL)){
            account.getStatistic().replace(longURL, account.getStatistic().get(longURL) + 1);
        }else {
            account.getStatistic().put(longURL,1);
        }
    }
    public Map<String, Integer> getSat(){
        return account.getStatistic();
    }

}
