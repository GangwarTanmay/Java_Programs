// Checking whether the given array in sorted or not
package ArrayProblems;

import java.util.Scanner;

public class Sorted {
    static int Check(int arr[])
    {
        int flag = -1;
        for(int i=0 ; i<arr.length-1 ; i++)
        {
            if(arr[i+1]>=arr[i])
            {
                flag=1;
            }
            else{
                flag=0;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int l = sc.nextInt();
        int [] a = new int[l];
        System.out.println("Enter array elements - ");
        for(int i=0 ; i<l ; i++)
        {
            a[i] = sc.nextInt();
        }
        if(Check(a) == 1)
        {
            System.out.println("Array is sorted.");
        }
        else{
            System.out.println("Array is not sorted.");
        }
    }
}
