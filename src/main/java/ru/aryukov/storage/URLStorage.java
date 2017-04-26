package ru.aryukov.storage;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by olega on 25.04.17.
 */
  class URLStorage {

    private HashMap<String,String> storage = new HashMap<>();

    public Map<String, String > getStorage(){
        return this.storage;
    }

}
