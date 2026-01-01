package Day19;

class ArrayListExample {
    int[] arr;   // Array to store elements
    int size;    // Number of elements in the list
    int capacity; // Maximum capacity of array

    // Constructor
    ArrayListExample(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;
    }

    // Add element at the end
    void add(int x) {
        if (size == capacity) {
            System.out.println("List is full");
            return;
        }
        arr[size] = x;
        size++;
        System.out.println(x + " added to list");
    }

    // Remove element at given index
    void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }
        System.out.println(arr[index] + " removed from list");
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    // Display all elements
    void display() {
        if (size == 0) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("List: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Main class
public class Code08 {
    public static void main(String[] args) {
        ArrayListExample list = new ArrayListExample(5);

        list.add(10);
        list.add(20);
        list.add(30);
        list.display();

        list.remove(1); // Remove element at index 1 (20)
        list.display();

        list.add(40);
        list.add(50);
        list.add(60); // List is full
        list.display();
    }
}
