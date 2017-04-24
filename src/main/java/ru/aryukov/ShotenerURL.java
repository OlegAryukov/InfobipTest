package ru.aryukov;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * Created by olega on 24.04.17.
 */
public class ShotenerURL {

    public String getShortURL(String longURL){
        String urlEncoded = longURL;
        StringBuilder strBild = new StringBuilder(urlEncoded);

        if(urlEncoded.contains("http://")){
            strBild.substring(7);
        }else if (urlEncoded.contains("https://")){
            strBild.substring(8);
        }


        urlEncoded = strBild.reverse().toString();

        try {
            urlEncoded = Base64.getUrlEncoder().encodeToString(urlEncoded.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            System.out.println("This encoding is not supported!");
            e.printStackTrace();
        }
        System.out.println("Using URL Alphabet: " + urlEncoded);

        int size = urlEncoded.length() < 8 ? urlEncoded.length():8;
        return urlEncoded.substring(0,size);
    }
}
