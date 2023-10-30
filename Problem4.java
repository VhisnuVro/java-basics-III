import java.util.Scanner;

// Take an integer N as input, print the corresponding pattern for N.

// Input Format

// First and only line of input contains a single integer N.

// Constraints

// 1<=N<=5

// Output Format

// Output the pattern corresponding to the given N.

// Sample Input 0

// 5
// Sample Output 0

// 1
// 1 
// 1 3
// 1 3 
// 1 3 5
// Explanation 0

// 1_ 1_ 1_3_ 1_3_ 1_3_5

// _ is used to just show u space please use space inplace of underscore
public class Problem4 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        // Loop to print the stair pattern
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                if(j%2!=0)
                System.out.print(j+" ");

            }
            System.out.println();
        }
       scanner.close();
    }
}
