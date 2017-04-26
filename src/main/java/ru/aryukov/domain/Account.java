package ru.aryukov.domain;

import java.util.HashMap;

/**
 * Created by oaryukov on 25.04.2017.
 */
public class Account {
    private String login;
    private String password;
    private HashMap<String, Integer> statistic = new HashMap<>();

    public Account(){}
    public Account(String login, String password){
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public HashMap<String, Integer> getStatistic() {
        return statistic;
    }

    public void setStatistic(HashMap<String, Integer> statistic) {
        this.statistic = statistic;
    }
}
