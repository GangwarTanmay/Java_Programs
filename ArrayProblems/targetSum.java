// Program to count pair of array elements whose sum is equal to target Sum
package ArrayProblems;

import java.util.Scanner;

public class targetSum {
    static int countPair(int [] a, int target)
    {
        int count=0;
        for(int i=0 ; i<a.length ; i++)
        {
            for(int j=i ; j<a.length ; j++)
            {
                if(a[i]+a[j] == target)
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array.");
        int l = sc.nextInt();
        System.out.println("Enter array elements : ");
        int arr[] = new int[l];
        for(int i=0 ; i<l ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Target Sum : ");
        int target = sc.nextInt();

        System.out.println("No. of pairs are : "+countPair(arr,target));
    }
}
