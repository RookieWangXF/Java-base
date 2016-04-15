package cn.rookie;

/**
 * @author Rookie
 *
 */
class Node{
	int x;
	public Node() {
	}
	public Node(int x){
		this.x=x;
	}
	@Override
	public String toString() {
		return "���Ԫ�ص�ֵ��:"+this.x;
	}
}

class StackQ{
	private int length;
	public StackQ(int length) {
		this.length = length;
	}
	
	private int[] list = new int[this.length];
	private Node[] allNodes = new Node[this.length];
	private int stackTop = -1;
	private int maxIndex = -1;
	/*
	 * �������
	 */
	public void push(Node node) throws Exception {
		this.stackTop++;
		if (this.stackTop >= this.length) {
			throw new Exception("�������еı�ʾ��Χ��");
		}
		
		allNodes[stackTop] = node;
		if (node.x > getMax()) {
			list[stackTop] = maxIndex;
			maxIndex = stackTop;
		} else {
			list[stackTop] = -1;
		}
	}
	/*
	 * ��������
	 */
	public Node pop() throws Exception {
		Node ret;
		if (stackTop < 0) {
			throw new Exception("�����ˣ�����ʲô");
		}
		ret = allNodes[stackTop];
		if (stackTop == maxIndex) {
			maxIndex = list[stackTop];
		}
		stackTop--;
		return ret;
	}
	/*
	 * ��ȡ���ֵ����
	 */
	public int getMax(){
		if (maxIndex >= 0) {
			return allNodes[maxIndex].x;
		}
		return -1;
	}
}

public class QueueGetMax {
	
	public static void main(String[] args) {
		
	}

}
