// Program to print Array Elements using recursion
package ProblemsOnRecursion;

import java.util.Scanner;

public class ArrayElements {
    static void elements(int a[], int ind)
    {
        if(ind==-1) {
            return;
        }

        elements(a,ind-1);
        System.out.print(a[ind]+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int l=sc.nextInt();

        int [] a = new int[l];
        System.out.println("Enter array elements : ");
        for(int i=0 ; i<l ; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Array elements are : ");
        elements(a,l-1);
    }
}
