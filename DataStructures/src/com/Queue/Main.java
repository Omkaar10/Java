package com.Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(12);
        queue.enqueue(10);

        queue.enqueue(121);
        queue.enqueue(101);
        queue.enqueue(122);
        System.out.println("Removed:"+queue.dequeue());
        queue.enqueue(122);
        queue.showQueue();
        queue.enqueue(190892);
        System.out.println("Front:"+queue.getFront());
        System.out.println("rear:"+queue.getRear());
        System.out.println("Size:"+queue.getQueueCapacity());
    }
}