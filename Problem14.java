import java.util.Scanner;

// Take T (number of test cases) as input. For each test case, take integer N as input and Print the count of digits of that number.

// Note: No of digits for number 0 is considered as 1.

// Input Format

// The first line is the number T which denotes the total number of test cases. Next T lines contain an integer N for which you have to print the number of digits.

// Constraints

// NA

// Output Format

// For T different Numbers, Print the number of digits in separate lines.

// Sample Input 0

// 2
// 0
// 1
// Sample Output 0

// 1
// 1
// Explanation 0

// 0 and 1 both have only one digit.

// Sample Input 1

// 2
// 100
// 10101
// Sample Output 1

// 3
// 5
// Explanation 1

// 100 has three digits and 10101 has 5 digits.

public class Problem14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        boolean isPrime = true;
        for (int i = 2; i * i <= input1; i++) {
            if(input1%i == 0)
            {
               isPrime = false;
               break;
            }
        }
        if(isPrime && input1 != 1)
        {
         System.out.println("YES");
        }
        else
        {
              System.out.println("NO");
        }
        scanner.close();
    }
}
