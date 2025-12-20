package Day08;

// Replace all 0 digits in a number with 1

public class Code04 {
    public static void main(String[] args) {

        // Original number
        int num = 1001;

        // Used to maintain the correct digit position (ones, tens, hundreds...)
        int place = 1;

        // Variable to store the final number after replacement
        int newNumber = 0;

        // Loop until all digits of the number are processed
        while (num != 0) {

            // Extract the last digit of the number
            int digit = num % 10;

            // Replace digit 0 with 1
            if (digit == 0) {
                digit = 1;
            }

            // Build the new number with correct digit placement
            newNumber = newNumber + digit * place;

            // Move to the next digit position
            place *= 10;

            // Remove the last digit of the original number
            num /= 10;
        }

        // Display the final number after replacement
        System.out.println(newNumber);
    }
}
