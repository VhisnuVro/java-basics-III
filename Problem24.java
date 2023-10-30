import java.util.Scanner;

// Take an integer N as input, print the corresponding pattern for N.

// Input Format

// First and only line of input contains a single integer N.

// Constraints

// N is within range

// Output Format

// Output the pattern corresponding to the given N.

// Sample Input 0

// 3
// Sample Output 0

// ***
// * *
// ***
// Explanation 0

// Note : Except for the first line and the last line, every line will have N-2 spaces between the two stars.

// Sample Input 1

// 5
// Sample Output 1

// *****
// *   *
// *   *
// *   *
// *****
// Explanation 1

// Note : Except for the first line and the last line, every line will have N-2 spaces between the two stars.


public class Problem24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
              if(i == N-1 || i ==0 || j == 0 || j == N - 1)
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
