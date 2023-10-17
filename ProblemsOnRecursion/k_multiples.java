// Program to find k multiples of n
package ProblemsOnRecursion;

import java.util.Scanner;

public class k_multiples {
    static void multiples(int n, int k)
    {
        if(k==1) {
            System.out.print(n+" ");
            return;
        }

        multiples(n,k-1);
        System.out.print((n*k)+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n and k : ");
        int n = sc.nextInt();
        int k = sc.nextInt();

        long start = System.nanoTime();
        multiples(n,k);
        long end = System.nanoTime();
        float time = (float)(end - start)/1000000;
        System.out.println("\nFunction takes "+time+" milliseconds");
    }
}
