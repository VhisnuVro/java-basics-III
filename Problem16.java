import java.util.Scanner;

// You are given an integer N and the task is to reverse the digits of the given integer. Return 0 if the result overflows and does not fit in a 32 bit signed integer

// Look at the example for clarification.

// Input Format

// Input an Integer

// Constraints

// N belongs to the Integer limits.

// Output Format

// Return a single integer denoting the reverse of the given integer.




public class Problem16 {

    public static int reverseInteger(int x) {
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;

            // Check for overflow before adding a new digit
            if (reversed > 214748364 || (reversed == 214748364 && digit > 7))
                return 0; // Return 0 if overflow

            if (reversed < -214748364 || (reversed == -214748364 && digit < -8))
                return 0; // Return 0 if overflow

            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return reversed;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the integer N
        int N = scanner.nextInt();

        // Call the function to reverse the integer
        int result = reverseInteger(N);

        // Output the reversed integer or 0 if it overflows
        System.out.println(result);

        scanner.close();
    }
}
