import java.util.Scanner;

// You are given an integer N you need to print all the Armstrong Numbers between 1 to N. (N inclusive).

// If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.

// For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 ).

// Note: All the test cases in this problem are limited to 3 digit numbers.

// Input Format

// First and only line of input contains an integer N.

// Constraints

// 1 <= N <= 500

// Output Format

// Output all the Armstrong numbers in range [1,N] each in a new line.

// Sample Input 0

// 20
// Sample Output 0

// 1
// Explanation 0

// 1 is an armstrong number.

// Sample Input 1

// 200
// Sample Output 1

// 1
// 153
// Explanation 1

// 1 and 153 are armstrong number under 200.

public class Problem17 {

    public static boolean isArmstrong(int num) {
        int sum = 0;
        int originalNum = num;

        while (num > 0) {
            int digit = num % 10;
            int cube = digit * digit * digit;
            sum += cube;
            num /= 10;
        }

        return sum == originalNum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
