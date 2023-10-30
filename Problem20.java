
// You are given an integer A as input and you need to determine whether it is a palindrome or not. A palindrome integer is one whose digits, when reversed, result in the same number. For example, 121 is a palindrome because its reverse is also 121, but 123 is not a palindrome because its reverse is 321.

// Note: The given integer will not have any leading zeros.

// Input Format

// First and the only line contains a single integer A.

// Constraints

// 1 <= A <= 10^6

// Output Format

// Print Yes if it is palindromic, else print No.

// Sample Input 0

// 120
// Sample Output 0

// No
// Explanation 0

// For A = 120, reverse(A) = reverse(120) = 021 = 21 (removing leading zeroes). 120 is not equal to 21

// Sample Input 1

// 1001
// Sample Output 1

// Yes
// Explanation 1

// For A = 1001, reverse(A) = reverse(1001) = 1001, which is same as A.

// Sample Input 2

// 1001
// Sample Output 2

// Yes
// Explanation 2

// For A = 1001, reverse(A) = reverse(1001) = 1001, which is same as A.

import java.util.Scanner;

public class Problem20 {

    public static boolean isPalindrom(int num)
    {
        int number = num;
        int reversed = 0;

        while (num > 0)
        {
            int digit = num %10;
            reversed = reversed *10 + digit;
            num= num/10;
        }

        return number == reversed;
    }



    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if(isPalindrom(input))
        {
            System.out.println("Yes");
        }else
        {
              System.out.println("No");
        }
        scanner.close();
    }
}
