// Program to find the sum of series : 1-2+3-4+5-6+7..........
/*
f(n) = f(n-1)+n  , when n is odd
       f(n-1)-n  , when n is even
       0         , when n is 0
*/

package ProblemsOnRecursion;

import java.util.Scanner;

public class AlternateSignSum {
    static int sum(int n)
    {
        if(n==0)
            return 0;

        if(n%2==0)
        {
            return sum(n-1)-n;
        }
        return sum(n-1)+n;           // when n is odd
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();

        System.out.println("Sum = "+sum(n));
    }
}
