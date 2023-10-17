// Program to find unique element in an array where all elements are being repeated twice with one value being unique.
// Approach - Mark the elements which are repeated thus unmarked elements are unique
package ArrayProblems;

import java.util.Scanner;

public class uniqueElement {
    static int [] markNotUnique(int a[] , int l) // function to mark elements which are not unique
    {
        for(int i=0 ; i<a.length ; i++)
        {
            for(int j=i+1 ; j<a.length ; j++)
            {
                if(a[i] == a[j]) {
                    a[i] = -1;   // mark repeated elements as -1
                    a[j] = -1;
                }
            }
        }
        return a;
    }
    static void printUnique(int a[] , int l)
    {
        for(int i=0 ; i<a.length ; i++)
        {
            if(a[i]!=-1) {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array : ");
        int l = sc.nextInt();
        System.out.println("Enter array elements : ");
        int a[] = new int[l];
        for(int i=0 ; i<l ; i++)
        {
            a[i] = sc.nextInt();
        }
        a = markNotUnique(a,l);
        System.out.println("Unique elements are: ");
        printUnique(a,l);
    }
}
