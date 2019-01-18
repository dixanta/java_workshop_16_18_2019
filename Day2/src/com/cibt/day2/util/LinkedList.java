package com.cibt.day2.util;

public class LinkedList<T> {
    private Node<T> head;

    public void addFirst(T value) {
        if(head==null){
            head = new Node<T>(value, null);
        }else{
            head=new Node<T>(value,head);
        }
    }

    public void addLast(T value) {
        if (head == null) {
            addFirst(value);
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = new Node(value, null);
        }
    }

    public void addBefore(T beforeValue, T value) {
        Node<T> current = head;

        while (current.next != null) {
            if (current.next.value.equals(beforeValue)) {
                Node n = new Node<T>(value,current.next);
                
                current.next = n;
                break;
            }

            current = current.next;
        }

    }

    public void addAfter(T afterValue, T value) {
        Node curr = head;
        while (curr != null) {
            if (curr.value.equals(afterValue)) {
                curr.next = new Node<T>(value, curr.next);
            }
            curr = curr.next;
        }

    }

    public void print() {
        Node<T> curr = head;
        while (curr != null) {
            System.out.println(curr.value);
            curr = curr.next;
        }
    }

}