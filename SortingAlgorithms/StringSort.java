/* Program to sort a string array in lexicographically order.
example :  arr = ["apple","kiwi","banana","papaya","grapes"]
sorted array  =  ["apple","banana","grapes","kiwi","papaya"]
 */
package SortingAlgorithms;

import java.util.Scanner;

public class StringSort {
    static void sort(String [] a)
    {
        int l = a.length;
        for(int i=0 ; i<l ; i++)
        {
            for(int j=i+1 ; j<l ; j++)
            {
                if(a[i].compareTo(a[j])>0)
                {
                    swap(a,i,j);
                }
            }
        }
    }

    static void swap(String [] arr, int i, int j)
    {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length : ");
        int l = sc.nextInt();
        sc.nextLine();

        String [] arr = new String[l];
        System.out.println("Enter array elements : ");
        for(int i=0 ; i<l ; i++)
        {
            arr[i] = sc.nextLine();
        }
        sort(arr);
        System.out.println("Sorted array : ");
        for (String a:arr) {
            System.out.print(a+" ");
        }
    }
}
