package ru.aryukov;

import java.util.HashMap;

/**
 * Created by olega on 25.04.17.
 */
  class URLStorage {

    private HashMap<String,String> urlStorage = new HashMap<>();

    public HashMap<String, String > getUrlStorage(){
        return this.urlStorage;
    }

    public boolean addInURLStorage(String shortURL, String longURL){
        boolean result = false;
        if(!checkUrlContains(shortURL, longURL)){
            urlStorage.put(shortURL,shortURL);
            result = true;
        }
        return result;
    }

    private boolean checkUrlContains(String shortURL, String longURL){
        boolean result = false;
        if(urlStorage.containsKey(shortURL)){
                result = true;
        }
        return result;
    }

}
