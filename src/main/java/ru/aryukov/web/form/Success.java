package ru.aryukov.web.form;

/**
 * Created by olega on 26.04.17.
 */
public class Success<T> extends Result {
    private final T value;

    public Success(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
