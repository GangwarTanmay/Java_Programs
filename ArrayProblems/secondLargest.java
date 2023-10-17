// Program to find second largest element in an array
package ArrayProblems;

import java.util.Scanner;

public class secondLargest {
    static int Largest(int a[])  // function to find largest element in array
    {
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<a.length ; i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        return max;
    }
    static int [] markMax(int a[], int max)  // function to mark max elements
    {
        for(int i=0 ; i<a.length ; i++)
        {
            if(a[i] == max)
            {
                a[i] = Integer.MIN_VALUE;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int l = sc.nextInt();
        int [] arr = new int[l];
        System.out.println("Enter array elements : ");
        for(int i=0 ; i<l ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int max = Largest(arr);
        arr = markMax(arr,max);
        int SecondMax = Largest(arr);
        System.out.println("Second Largest is : "+SecondMax);
    }
}
