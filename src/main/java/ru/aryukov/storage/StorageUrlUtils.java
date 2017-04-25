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
            //operationResult = true;
        }
        if (!operationResult){
            urlStorage.getUrlStorage().put(shortURL,longURL);
        }
        return resultShortURL;
    }

    private boolean checkContains(String shortURL){
        boolean result = false;
        if(urlStorage.getUrlStorage().containsKey(shortURL)){
            result = true;
        }
        return result;
    }

    private boolean checkLongURL(String shortURL, String longURL){
        boolean result = false;
        if(urlStorage.getUrlStorage().get(shortURL).equals(longURL)){
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
