package practiceProblems;

import java.util.Scanner;
public class fibonacci {
    static void fib(int n)
    {
        int firstTerm=0, secondTerm=1, thirdTerm=0;
        System.out.print(firstTerm+" "+secondTerm+" ");
        for(int i=1 ; i<=n ; i++)
        {
            thirdTerm = firstTerm+secondTerm;
            System.out.print(thirdTerm+" ");
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        System.out.println("Fibonacci Series is : ");
        fib(n);
    }

}
