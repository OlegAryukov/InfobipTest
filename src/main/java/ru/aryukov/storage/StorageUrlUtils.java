package ru.aryukov.storage;

/**
 * Created by olega on 25.04.17.
 */
public class StorageUrlUtils {
    private URLStorage urlStorage = new URLStorage();
    private StringBuilder stb = new StringBuilder();

    public String  addURLinStorage(String shortURL, String longURL){
        String resultShortURL = shortURL;
        boolean operationResult = false;
        while (!operationResult){
            if(checkContains(resultShortURL)){
                if(checkLongURL(resultShortURL, longURL)){
                    operationResult = true;
                    continue;
                } else {
                    resultShortURL = changeShortURL(resultShortURL);
                    continue;
                }
            }
            break;
        }
        if (!operationResult){
            urlStorage.getStorage().put(shortURL,longURL);
        }
        return resultShortURL;
    }

    public String getLongURL(String shortURL){
        return urlStorage.getStorage().get(shortURL);
    }

    public boolean checkContains(String shortURL){
        boolean result = false;
        if(urlStorage.getStorage().containsKey(shortURL)){
            result = true;
        }
        return result;
    }

    private boolean checkLongURL(String shortURL, String longURL){
        boolean result = false;
        if(urlStorage.getStorage().get(shortURL).equals(longURL)){
            result = true;
        }
        return result;
    }

    private String changeShortURL(String shortURL){
        stb.append(shortURL);
        stb.append(shortURL.substring(0,1));
        return stb.reverse().toString();
    }

    
}
