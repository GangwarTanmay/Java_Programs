package ProblemsOnRecursion;

import java.util.Scanner;

public class gcd {

    // Brute Force Approach
//    static int gcd(int a, int b)
//    {
//        for(int i=Math.min(a,b) ; i>=1 ; i--)
//        {
//            if(a%i==0 && b%i==0)
//                return i;
//        }
//        return 0;
//    }

    // gcd using long division method
//    static int gcd(int a, int b)
//    {
//        int max = Math.max(a,b);
//        int min = Math.min(a,b);
//        while(max%min != 0 )
//        {
//            int r = max%min;
//            max = min;
//            min = r;
//        }
//        return min;
//    }

    // GCD using Euclid's Algorithm
    static int gcd(int a, int b)
    {
        if(b==0)
            return a;

        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Greatest Common Divisor : "+gcd(a,b));
    }
}
