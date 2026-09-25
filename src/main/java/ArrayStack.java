/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author natas
 */
public class ArrayStack {

    private int[] stack;
    private int top;

    public ArrayStack(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (top == stack.length - 1) {
            throw new RuntimeException("Stack is full");
        }

        stack[++top] = value;
    }

    public int pop() {
        if (top == -1) {
            throw new RuntimeException("Stack is empty");
        }

        return stack[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}