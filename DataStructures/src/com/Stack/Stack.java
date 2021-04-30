package com.Stack;

public class Stack {
    private int[] stack;
    private int top;
    int stackSize=2;

    public Stack() {
        this.top = 0;
        this.stack = new int[stackSize];
    }

    private void expandStack() {
        int[] bigStack = new int[stackSize*2];
        System.arraycopy(this.stack, 0,bigStack,0,this.top);
        this.stack = bigStack;
        this.stackSize *= 2;
    }

    private void shrinkStack() {
        int[] smallStack = new int[stackSize/2];
        System.arraycopy(this.stack, 0,smallStack,0,this.top);
        this.stack = smallStack;
        this.stackSize /= 2;
    }

    private boolean isStackEmpty() {
        return this.top == 0;
    }

    public void push(int element) {
        if(this.top == this.stackSize)
            expandStack();
        stack[top] = element;
        this.top++;

    }

    public int pop() {
        if(!isStackEmpty()) {
            if(this.top <= this.stackSize/2)
                shrinkStack();
            this.top--;
            int data;
            data = stack[top];
            stack[top]=0;
            return data;
        }
        else
            return -1;
    }

    public int peek() {
        if(!isStackEmpty()) {
            int topData;
            topData=stack[top-1];
            return topData;
        }
        else
            return -1;
    }

    public void showStack() {
        System.out.println("Current Stack: ");
        for(int i = top-1; i>=0; i--) {
            System.out.println(stack[i]);

        }
    }
}

