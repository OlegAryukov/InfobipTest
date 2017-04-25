package ru.aryukov;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Base64;
import java.util.StringTokenizer;

/**
 * Created by olega on 24.04.17.
 */
public class ShotenerURL {

    public String getShortURL(String longURL) throws UnsupportedEncodingException {

        String currentURL = longURL;
        if(currentURL.contains("http://")){
            currentURL = currentURL.substring(7);
        }else if (currentURL.contains("https://")){
            currentURL = currentURL.substring(8);
        }
        
        StringTokenizer stk = new StringTokenizer(currentURL, "/-_");
        StringBuilder stb = new StringBuilder();

        while (stk.hasMoreTokens()){
            String tmp = Base64.getEncoder().encodeToString(stk.nextToken().getBytes("utf-8"));
            stb.append(tmp.substring(0,1));
        }

        String urlEncoded = stb.reverse().toString();

        String test = null;
        try {
             test = Base64.getUrlEncoder().encodeToString(longURL.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            System.out.println("This encoding is not supported!");
            e.printStackTrace();
        }
        System.out.println("Using URL Alphabet: " + test);

        return urlEncoded;
    }
}
