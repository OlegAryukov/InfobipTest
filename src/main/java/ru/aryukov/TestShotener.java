package ru.aryukov;

/**
 * Created by olega on 24.04.17.
 */
public class TestShotener {
    public static void main(String[] args) {
        ShotenerURL shotenerURL = new ShotenerURL();
        System.out.println(shotenerURL.getShortURL("http://dzone.com/test/url-shortener-service-42-lines"));
    }
}
