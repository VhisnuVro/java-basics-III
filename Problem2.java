// Input Format

// First line of input contains an integers N (no of rows).

// Second line of input contains an integer M (no of cols).

// Constraints

// 2 <= N, M <= 100

// Output Format

// Output N * M rectangle of stars.

// Sample Input 0

// 2
// 3
// Sample Output 0

// ***
// ***
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
         int input2 = scanner.nextInt();

         for(int i = 0 ; i<input1 ; i++)
         {
            for(int j = 0 ; j<input2 ; j++)
            {
                System.out.print("*");
 
            }
            System.out.println();
         }
       scanner.close();

    }
    
}
