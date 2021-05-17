package oop.chap05.exam05;

import oop.chap05.exam03.MyLinkedList;
import oop.chap05.exam03.MyListNode;

interface IQueue {
    public void enQueue(String data);
    public String deQueue();
    public void printAll();
}

public class MyListQueue extends MyLinkedList implements IQueue {

    MyListNode front;
    MyListNode rear;

    public MyListQueue() {
        front = null;
        rear = null;
    }

    @Override
    public void enQueue(String data) {
        MyListNode newNode;
        if (isEmpty()) {
            newNode = addElement(data);
            front = newNode;
            rear = newNode;
        } else {
            newNode = addElement(data);
            rear = newNode;
        }
        System.out.println(newNode.getData() + " added");
    }

    @Override
    public String deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }
        String data = removeElement(0).getData();
        front = front.next;

        // 마지막 항목일 경우
        if (front == null) {
            rear = null;
        }

        return data;
    }
}
