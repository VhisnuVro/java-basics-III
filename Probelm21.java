import java.util.Scanner;

// Given an integer N, print the corresponding Inverted Half Pyramid pattern for N.

// Input Format

// First and only line of input contains a single integer N.

// Constraints

// NA

// Output Format

// Output the Inverted Half Pyramid pattern corresponding to the given N.

// Sample Input 0

// 5
// Sample Output 0

// *****
// ****
// ***
// **
// *



public class Probelm21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for (int i = input ; i >=1 ; i--)
        {
            for (int j = 1 ; j <=i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    
        scanner.close();
    }
    
}
