package com.example.demo;

public class ObjectContainer<T> {
    private T object;

    public void setObject(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }
}

