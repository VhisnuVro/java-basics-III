import java.util.Scanner;
// Print a pattern consisting of N rows, where each row contains an asterisk (*) at the beginning and end of the line, with N-2 spaces in between.

// The Pattern should look like:


// Print the above pattern for a total of N Rows.

// Refer Example ouput, for better clarification.

// Input Format

// First and only line of input contains a single integer N.

// Constraints

// 1<=N<=100

// Output Format

// Output the pattern corresponding to the given N.

// Sample Input 0

// 4
// Sample Output 0

// *  *
// *  *
// *  *
// *  *
// Explanation 0

// Here N = 4, So each row should have N - 2 spaces which is 2. Thus the N rows(i.e, 4 rows) should be in the form (asterisk)(2 spaces)(asterisk)

public class Problem5 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input; j++) {
                if(j == 1 || j==input)
                {
                System.out.print("*");
                }
                else
                {
                 System.out.print(" ");   
                }

            }
            System.out.println();
        }
       scanner.close();
    }
}
