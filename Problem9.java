import java.util.Scanner;

// Write a program to find sum all Natural numbers from 1 to N where you have to take N as input from user

// Input Format

// A single line representing N

// Constraints

// NA

// Output Format

// A single integer showing sum of all Natural numbers from 1 to N

// Sample Input 0

// 5
// Sample Output 0

// 15

public class Problem9 {
    public static void main(String[] args) {

        //Sn = n(n+1)/2
         Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();   
        System.out.print(N*(N+1)/2);
        scanner.close();
    }
}
