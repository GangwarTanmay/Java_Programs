/* Check if we can partition the array into two sub-arrays with equal sum.
More formally check that the prefix sum of a part of array is equal to the suffix sum of rest of the array.
*/
package ProblemsOnArray;

import java.util.Scanner;

public class CheckSubarray {
    static int [] prefixSum(int a[])
    {
        int [] pref = new int[a.length];
        pref[0] = a[0];
        for(int i=1 ; i<a.length ; i++)
        {
            pref[i] = pref[i-1] + a[i];
        }
        return pref;
    }

    static int compareSuffixPrefix(int a[], int totalSum)
    {
        int [] pref = prefixSum(a);
        for(int i=0 ; i<pref.length-1 ; i++) {
            int prefSum = pref[i];
            int suffixSum = totalSum - prefSum;
            if (prefSum == suffixSum) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length : ");
        int l = sc.nextInt();
        int a[] = new int[l];
        int sum = 0;

        System.out.println("Enter array elements : ");
        for(int i=0 ; i<l ; i++)
        {
            a[i] = sc.nextInt();
            sum = sum+a[i];
        }

        if(compareSuffixPrefix(a,sum) != -1)
        {
            System.out.println("Partition is possible from "+compareSuffixPrefix(a,sum)+" index.");
        }
        else{
            System.out.println("Partition is not possible.");
        }
    }
}
