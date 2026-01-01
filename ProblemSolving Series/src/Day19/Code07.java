package Day19;

class CircularQueue {
    int[] queue;
    int front, rear, size, capacity;

    // Constructor
    CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue operation
    void enqueue(int x) {
        if (size == capacity) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % capacity; // circular increment
        queue[rear] = x;
        size++;
        System.out.println(x + " added to queue");
    }

    // Dequeue operation
    void dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow");
            return;
        }
        System.out.println(queue[front] + " removed from queue");
        front = (front + 1) % capacity; // circular increment
        size--;
    }

    // Display queue elements
    void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}

// Main class
public class Code07 {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);
        cq.display();

        cq.dequeue();
        cq.dequeue();
        cq.display();

        cq.enqueue(60);
        cq.enqueue(70);
        cq.display();

        cq.enqueue(80); // Overflow example
    }
}
