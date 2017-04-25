package ru.aryukov.storage;

import java.util.HashMap;

/**
 * Created by olega on 25.04.17.
 */
  class URLStorage {

    private HashMap<String,String> urlStorage = new HashMap<>();

    public HashMap<String, String > getUrlStorage(){
        return this.urlStorage;
    }

}
