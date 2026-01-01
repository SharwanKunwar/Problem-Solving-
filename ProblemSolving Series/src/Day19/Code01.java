package Day19;

// wap in java to implement stack using linked list.

class Stack{
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node top = null;

    // push operation
    void push(int x){
        Node node = new Node(x);
        node.next = top;
        top = node;
        System.out.println(x+ " is pushed to the stack");
    }
    //pop operation
    void pop(){
        if(top == null){
            System.out.println("Stack is underflow");
        }else {
            System.out.println(top.data+" is popped from the stack");
            top = top.next;
        }
    }
    // display stack
    void display(){
        if(top == null){
            System.out.println("The stack is empty");
            return;
        }else {
            Node temp = top;
            while(temp != null){
                System.out.println(temp.data+" -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
    }
}

public class Code01 {
    static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(50);
        s.push((60));
        s.pop();
        s.pop();
        s.display();
    }
}
