/* Program to find prefix sum in an array.
e.g., a[]= {1,2,3,4,5}
  pref[] = {1,2,6,10,15}

  pref[i] = pref[i-1] + a[i];
 */

package ArrayProblems;

import java.util.Scanner;

public class PrefixSum {

    static void prefSum(int a[])      // function to find prefix sum without creating a new array
    {
        for(int i=1 ; i<a.length ; i++)
        {
            a[i] = a[i]+a[i-1];
        }
    }

    /*static int [] prefSum(int a[])  // function to find prefix sum by creating a new array
    {
        int [] pref = new int[a.length];
        for(int i=0 ; i<a.length ; i++)
        {
            if(i>=1)
            {
                pref[i] = pref[i-1] + a[i];
            }
            else{
                pref[i] = a[i];
            }
        }
        return pref;
    }*/

    static void print(int a[])
    {
        for(int i=0 ; i<a.length ; i++)
        {
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int l = sc.nextInt();

        int a[] = new int[l];

        System.out.println("Enter array elements : ");
        for(int i=0 ; i<l ; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Prefix Sum Array : ");
        prefSum(a);
        print(a);
    }
}
