package Day19;

// Node class
class Node2 {
    int data;
    Node next;

    Node2(int data) {
        this.data = data;
        this.next = null;
    }
}

// Queue class using linked list
class QueueLinkedList {
    Node front, rear;

    // Constructor
    QueueLinkedList() {
        front = rear = null;
    }

    // Enqueue operation
    void enqueue(int x) {
        Node newNode = new Node(x);
        if (rear == null) { // Empty queue
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(x + " added to queue");
    }

    // Dequeue operation
    void dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return;
        }
        System.out.println(front.data + " removed from queue");
        front = front.next;
        if (front == null) rear = null; // If queue becomes empty
    }

    // Peek operation
    void peek() {
        if (front == null) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front element is: " + front.data);
        }
    }

    // Display queue
    void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

// Main class
public class Code11 {
    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();

        queue.peek();
        queue.dequeue();
        queue.display();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue(); // Underflow example
    }
}
