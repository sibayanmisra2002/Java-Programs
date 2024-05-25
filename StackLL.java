import java.util.*;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class StackLL{
	private Node head;
	private int size;
	public StackLL(){
		head=null;
		size=0;
	}
	void push(int data){
		Node temp=new Node(data);
		temp.next=head;
		size++;
		head=temp;
	}
	int peek(){
		if(head==null){
			System.out.println("Underflow");
		}
		return head.data;
	}
	int pop(){
		if(head==null){
			System.out.println("Underflow");
		}
		int res=head.data;
		head=head.next;
		size--;
		return res;
	}
	boolean isEmpty(){
		return head==null;
	}
	int size(){
		return size;
	}

public static void main(String[] args) {
        StackLL stack = new StackLL();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack size: " + stack.size());
    }
}
			