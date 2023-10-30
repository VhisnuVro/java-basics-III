import java.util.Scanner;

// You are given two integers A and B. You have to find the value of A^B.

// NOTE: The value of A^B will always be less than or equal to 10^9.

// Input Format

// First line of the input contains a single integer A.

// Second line of the input contains a single integer B.

// Constraints

// 1 <= A, B <= 1000

// Output Format

// Print a single integer in single line.

// Sample Input 0

// 2
// 3
// Sample Output 0

// 8

public class Problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();   
        int sq = 1;  
        for(int i = 1; i<=input2 ; i++)
        {
            sq*= input1;
        }
            System.out.println(sq);
        

        scanner.close();
    }
}
