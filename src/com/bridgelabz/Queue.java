package com.bridgelabz;

import java.util.LinkedList;

public class Queue <T> {
    LinkedList<T> list = new LinkedList<>();
    public void enqueue(T data){
        list.add(data);
    }
    public T dequeue(){
        return list.pop();
    }

    public int size(){
        return list.size();
    }

}
