package cn.rookie.stack;

import java.util.Stack;


public class ImplementQueueusingStacks {
    Stack<Integer> stackFirst = new Stack<Integer>();
    Stack<Integer> stackSecond = new Stack<Integer>();
    // Push element x to the back of queue.
    public void push(int x) {
        stackFirst.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if (stackSecond.empty()) {
            while (!stackFirst.empty()) {
                stackSecond.push(stackFirst.pop());
            }
        }
        stackSecond.pop();
    }

    // Get the front element.
    public int peek() {
        if (stackSecond.empty()) {
            while (!stackFirst.empty()) {
                stackSecond.push(stackFirst.pop());
            }
        }
        return stackSecond.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stackFirst.empty() && stackSecond.empty();
    }
}
