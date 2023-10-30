import java.util.Scanner;

// Take an integer N as input, print the corresponding pattern for N.

// Input Format

// First and only line of input contains a single integer N.

// Constraints

// 1 <= N <= 100

// Output Format

// Output the pattern corresponding to the given N.

// Sample Input 0

// 2
// Sample Output 0

//  *
// **
public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
