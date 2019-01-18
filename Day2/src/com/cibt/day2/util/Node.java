package com.cibt.day2.util;

public class Node<T>{
    public T value;
    public Node next;

    public Node(T value,Node next){
        this.value=value;
        this.next=next;
    
    }
}