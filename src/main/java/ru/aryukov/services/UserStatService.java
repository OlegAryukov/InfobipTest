package ru.aryukov.services;

import ru.aryukov.User;

import java.util.HashMap;

/**
 * Created by oaryukov on 25.04.2017.
 */
public class UserStatService {
    private User user;

    public UserStatService(User user){
        this.user = user;
    }

    public void changeStat(String longURL){
        if(user.getStatistic().containsKey(longURL)){
            user.getStatistic().replace(longURL, user.getStatistic().get(longURL) + 1);
        }else {
            user.getStatistic().put(longURL,1);
        }
    }
    public HashMap<String, Integer> getSat(){
        return user.getStatistic();
    }
}
