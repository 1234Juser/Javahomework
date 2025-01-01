package org.example.generic11.basic;

public class Container<T> {
    private T data;

    public Container(T data) {
        this.data = data;
    }

    public T get() {
        return data;
    }

    public void add(T data) {
        this.data = data;
    }
}
