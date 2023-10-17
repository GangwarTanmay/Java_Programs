// Program to sort an array having elements only zero and one using two pointers approach
package ProblemsOnArray;

import java.util.Scanner;

public class SortArrayZeroAndOne {
    static void sortArray(int a[])
    {
        int left = 0;
        int right = a.length-1;
        while(left<right)
        {
            if(a[left] == 1 && a[right]==0)
            {
                swap(a, left, right);
                left++;
                right--;
            }
            if(a[left] == 0)   // when a[left] is already 0 then we can move left pointer, but right pointer will not move.
            {
                left++;
            }
            if(a[right] == 1)  // when a[right] is already 1 then we can move right pointer, but left pointer will not move.
            {
                right--;
            }
        }
    }
    static void swap(int a[], int x, int y)
    {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    static void printArray(int arr[])
    {
        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int l = sc.nextInt();
        int a[] = new int[l];
        System.out.println("Enter array elements : ");
        for(int i=0 ; i<a.length ; i++)
        {
            a[i] = sc.nextInt();
        }
        sortArray(a);
        System.out.println("Array after sorting : ");
        printArray(a);
    }
}
