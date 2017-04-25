package ru.aryukov;

import java.io.UnsupportedEncodingException;

/**
 * Created by olega on 24.04.17.
 */
public class TestShotener {
    public static void main(String[] args) {
        ShotenerURL shotenerURL = new ShotenerURL();
        try {
            System.out.println(shotenerURL.getShortURL("http://dzone.com/test/url-shortener-service-42-lines"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
