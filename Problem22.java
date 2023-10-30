import java.util.Scanner;

// Take an integer N as input, print the corresponding pattern for N. please see the sample test case to get clear undestanding of test case

// Input Format

// First and only line of input contains a single integer N.

// Constraints

// 1<=N<=100

// Output Format

// Output the pattern corresponding to the given N.

// Sample Input 0

// 2
// Sample Output 0

// **
//  *
// Explanation 0

// ** _*

// Note : Here '_' represents space for explanation purpose only. You have to print space in your code.

// Sample Input 1

// 3
// Sample Output 1

// ***
//  **
//   *
// Explanation 1

// ** _* Note : Here '_' represents space for explanation purpose only. You have to print space in your code.

// Sample Input 2

// 4
// Sample Output 2

// ****
//  ***
//   **
//    *

public class Problem22 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for (int i = 1 ; i <=input ; i++)
        {
            for (int j = 1 ; j <=input ; j++)
            {
                if(j>=i)
                {
                    System.out.print("*");
                }else
                {
                      System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
