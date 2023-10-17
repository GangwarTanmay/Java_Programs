// Program to find triplets of array elements whose sum is equal to the target sum
package ArrayProblems;

import java.util.Scanner;

public class tripletSum {
    static int countTriplet(int[] a, int target)
    {
        int count = 0 ;
        for(int i=0 ; i<a.length ; i++)
        {
            for (int j=i+1 ; j<a.length ; j++)
            {
                for(int k=j+1 ; k<a.length ; k++)
                {
                    if(a[i]+a[j]+a[k] == target)
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array : ");
        int l = sc.nextInt();
        System.out.println("Enter array elements : ");
        int [] a = new int[l];
        for(int i=0  ; i<l ; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter target sum : ");
        int target = sc.nextInt();

        System.out.println("No. of triplets are : "+countTriplet(a,target));
    }
}
