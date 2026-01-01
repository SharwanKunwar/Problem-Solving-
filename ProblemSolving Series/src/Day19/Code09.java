package Day19;

// Node class for linked list
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Stack class using linked list
class StackLinkedList {
    Node top; // Points to top of stack

    // Constructor
    StackLinkedList() {
        top = null;
    }

    // Push operation
    void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top; // Insert at head
        top = newNode;
        System.out.println(x + " pushed into stack");
    }

    // Pop operation
    void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println(top.data + " popped from stack");
        top = top.next; // Remove head
    }

    // Peek operation
    void peek() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element is: " + top.data);
        }
    }

    // Display stack
    void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        System.out.print("Stack: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

// Main class
public class Code09 {
    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        stack.peek();
        stack.pop();
        stack.display();

        stack.pop();
        stack.pop();
        stack.pop(); // Underflow
    }
}
