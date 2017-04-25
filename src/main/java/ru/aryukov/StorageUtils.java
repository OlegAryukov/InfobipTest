package ru.aryukov;

/**
 * Created by olega on 25.04.17.
 */
public class StorageUtils {
    URLStorage urlStorage;

    public String  addURLinStorage(String shortURL, String longURL){
        String resultShortURL = shortURL;
        urlStorage.getUrlStorage().put(shortURL,longURL);
        return resultShortURL;
    }

    
}
