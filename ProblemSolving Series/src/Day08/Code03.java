package Day08;

// Count frequency of each digit in a number

public class Code03 {
    public static void main(String[] args) {

        // Given number whose digit frequency is to be calculated
        int num = 1445;

        // Store the original number so it is not modified permanently
        int org = num;

        // Loop until all digits of 'num' are processed
        while (num != 0) {

            // Extract the last digit of the number
            int digit = num % 10;

            // Counter to store frequency of the current digit
            int count = 0;

            // Temporary variable used to traverse the original number
            int temp = org;

            // Inner loop to count how many times 'digit' appears in 'org'
            while (temp != 0) {

                // Compare extracted digit with current digit of temp
                if (temp % 10 == digit) {
                    count++;
                }

                // Remove the last digit of temp
                temp /= 10;
            }

            // Display the frequency of the current digit
            System.out.println("Digit " + digit + " appears " + count + " times");

            // Remove the last digit of num to process the next digit
            num /= 10;
        }
    }
}
