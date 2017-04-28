package ru.aryukov.web.form;

/**
 * Created by olega on 26.04.17.
 */
public class Error implements Result {
    private final String error;

    public Error(String error) {
        this.error = error;
    }

    public String getValue() {
        return error;
    }
}
