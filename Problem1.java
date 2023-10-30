import java.util.Scanner;

// Given an integer N, print N stars in a single line.

// For example if N = 5 then pattern will be like:

// Input Format

// Single line input contains a single integer N.

// Constraints

// 2 <= N <= 100

// Output Format

// Output N stars in a single line.

// Sample Input 0

// 3
// Sample Output 0

// ***

class Problem1 {
    public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();

        for (int i = 1 ; i<=input1 ;i++)
        {
            System.out.print("*");
        }
   
        scanner.close();
    }
}