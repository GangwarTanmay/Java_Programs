package SortingAlgorithms;

import java.util.Scanner;

public class BubbleSort {
    static void sort(int arr[])
    {
        for(int i=0 ; i<arr.length ; i++)
        {
            boolean flag = false; // to check if array is sorted, if no swapping done throughout the iterations of j then array is sorted
            for(int j=0 ; j<arr.length-i-1 ; j++)
            {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    flag = true; // swapping happened
                }
            }

            if(!flag) // means no swapping done, array is sorted
            {
                return;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int l = sc.nextInt();

        int a[] = new int[l];

        System.out.print("Enter array elements : ");
        for(int i=0 ; i<l ; i++)
        {
            a[i] = sc.nextInt();
        }

        long start = System.nanoTime();
        sort(a);
        long end = System.nanoTime();

        float time = (float)(end-start)/1000000;
        System.out.print("Sorted array : ");
        for(int i=0 ; i<l ; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("\nProgram took "+time+" milliseconds");
    }
}
