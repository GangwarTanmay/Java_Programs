package ProblemsOnRecursion;

import java.util.Scanner;

public class DigitSum {
    static int Sum(int n)
    {
        if(n>=0 && n<=9)
            return n;

        int d = n%10;
        return d+Sum(n/10);
    }

    static int count(int n)
    {
        if(n<=0)
            return 1;

        return count(n/10)+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();

        System.out.println("Sum of digits = "+Sum(n));
        System.out.println("Count of digits = "+count(n));
    }
}
