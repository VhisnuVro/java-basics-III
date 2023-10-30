import java.util.Scanner;

public class Pfoblem19 {
      // Function to calculate LCM using GCD (Greatest Common Divisor)
      public static int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b);
    }
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input integers A and B
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // Calculate LCM and output the result
        int lcm = calculateLCM(A, B);
        System.out.println(lcm);
        scanner.close();

    }
}
