/* Given an array of integers of size n. Answer q queries where you need to print the sum of values in a given range of indices
from l to r (both included)

The values of l and r in queries follow 1-based indexing
 */

package ProblemsOnArray;

import java.util.Scanner;

public class PrefixSumQueries {
    static void prefixSum (int a[])
    {
        for(int i=1 ; i<a.length ; i++)
        {
            a[i] = a[i]+a[i-1];
        }
    }

    static int solveQuery(int [] a, int l, int r)
    {

        int sum = a[r] - a[l-1];
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array : ");
        int n = sc.nextInt();
        int a [] = new int[n+1];

        System.out.println("Enter array elements : ");
        for(int i=1 ; i<=n ; i++)   // array follow 1-based indexing
        {
            a[i] = sc.nextInt();
        }
        prefixSum(a);
        while(true)
        {
            System.out.print("\nEnter value of l and r : ");
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println("Sum between "+l+" and "+r+" index is : "+solveQuery(a,l,r));
        }
    }
}
