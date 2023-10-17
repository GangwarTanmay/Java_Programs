// Program to find last occurrence of an element in array
package ArrayProblems;

import java.util.Scanner;

public class lastOccurrence {

    static int lastOccur(int [] a, int x)
    {
        int ind=-1;
        for(int i=0 ; i<a.length ; i++)
        {
            if(a[i] == x)
            {
                ind = i;
            }
        }
        return ind;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int l = sc.nextInt();
        int arr[] = new int[l];
        System.out.println("Enter array elements : ");
        for (int i=0 ; i<l ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        System.out.println("Last occurrence of "+n+" is at "+lastOccur(arr,n)+" index");
    }
}
