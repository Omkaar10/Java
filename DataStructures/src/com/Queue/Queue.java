package com.Queue;

public class Queue {
    private int front;
    private int rear;
    private int[] queue;
    private int queueCapacity;


    public Queue(int queueSize) {
        this.front = -1;
        this.rear = -1;
        this.queueCapacity = 0;
        this.queue = new int[queueSize];
    }

    private boolean isQueueEmpty() {
        return this.queueCapacity == 0;
    }

    private boolean isQueueFull() {
        return this.queueCapacity == 5;
    }

    public void enqueue(int element) {
        if(!isQueueFull()) {
            //this.rear++;
            this.rear = (this.rear + 1) % 5;
            queue[this.rear] = element;
            this.queueCapacity++;
        }
        else
            System.out.println("Queue is full");
    }

    public int dequeue() {
        if(!isQueueEmpty()) {
            //this.front++;
            this.front = (this.front + 1) % 5;
            int data = queue[this.front];
            this.queueCapacity--;
            return data;
        }
        else
            return -1;
    }

    public int peek() {
        if(!isQueueEmpty()) {
            int data;
            data = queue[this.front+1];
            return data;
        }
        else
            return -1;
    }

    public int getQueueCapacity() {
        return queueCapacity;
    }

    public int getFront() {
        return this.front;
    }

    public int getRear() {
        return this.rear;
    }

    public void showQueue() {
        System.out.println("Current Queue: ");
        for(int i=0; i < queueCapacity; i++) {
            //System.out.println(queue[front+1+i]);
            System.out.println(queue[(front+1+i)%5]);
        }
    }
}