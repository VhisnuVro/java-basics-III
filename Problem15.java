import java.util.Scanner;

// Given the Number of Test Cases as T, For each test case, take an integer N as input, you have to tell whether it is a perfect number or not.

// A perfect number is a positive integer that is equal to the sum of its proper positive divisors (excluding the number itself). A positive proper divisor divides a number without leaving any remainder.

// Input Format

// The first line of the input contains a single integer T. Each of the next T lines contains a single integer N.

// Constraints

// 1 <= T <= 10 1 <= N <= 106

// Output Format

// For each testcase, print YES if the given integer is perfect, else print NO, in a separate line

// Sample Input 0

// 2
// 4
// 6
// Sample Output 0

// NO
// YES
// Explanation 0

// For the first test case A = 4, the answer is "NO" as sum of its proper divisors = 1 + 2 = 3, is not equal to 4. For the second test case A = 6, the answer is "YES" as sum of its proper divisors = 1 + 2 + 3 = 6, is equal to 6.

// Sample Input 1

// 1
// 3
// Sample Output 1

// NO

public class Problem15 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int testcase = scanner.nextInt();
      while (testcase-- >0) {
        int input = scanner.nextInt();
        int sum = 1; // 1 is always a pefect devisier
        if (input <= 1) {
            System.out.println("NO");
        } else {
            for (int i = 2 ; i*1<= input; i++)
            {
                if(input%i == 0)
                {
                    sum +=i;
                    if(i!= input/i)
                    {
                      sum += input/i;  
                    }
                }
            }
            if (sum == input) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
      }
        scanner.close();
    }
}
