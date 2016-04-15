package cn.rookie.stack;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
	private Queue<Integer> myQueue = new LinkedList<Integer>();
	private LinkedList<Integer> linkedList = new LinkedList<Integer>();
	
    // Push element x onto stack.
    public void push(int x) {
    	//�����б�Ŀ�ͷ��������Ū����
        linkedList.addFirst(x); 
        myQueue.clear();
        myQueue.addAll(linkedList);
    }

    // Removes the element on top of the stack.
    public void pop() {
        myQueue.remove();
    }

    // Get the top element.
    public int top() {
        return myQueue.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return myQueue.isEmpty();
    }
}

public class ImplementStackusingQueues {

	public static void main(String[] args) {

	}

}
