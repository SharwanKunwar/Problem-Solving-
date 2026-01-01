package Day19;

class LinearQueue {
    int[] queue;
    int front, rear, size;

    // Constructor
    LinearQueue(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue operation
    void enqueue(int x) {
        if (rear == queue.length - 1) {
            System.out.println("Queue Overflow");
        } else {
            rear++;
            queue[rear] = x;
            size++;
            System.out.println(x + " added to queue");
        }
    }

    // Dequeue operation
    void dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(queue[front] + " removed from queue");
            front++;
            size--;
        }
    }

    // Display queue elements
    void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
}

// Main class
public class Code06 {
    public static void main(String[] args) {
        LinearQueue q = new LinearQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        q.dequeue();
        q.display();

        q.enqueue(40);
        q.enqueue(50);
        q.display();

        q.enqueue(60); // Overflow example
    }
}
