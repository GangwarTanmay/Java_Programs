/* Given an array arr, move all the 0s to the right end of the array while maintaining the relative order of non-zero elements.
e.g.,  arr = [0, 5, 3, 0, 8, 0, 2]
sorted array = [5, 3, 8, 2, 0, 0, 0]
*/
package SortingAlgorithms;

import java.util.Scanner;

public class problem1 {

    static void sort(int arr[])
    {
        int l = arr.length;
        for(int i=0 ; i<l ; i++)
        {
            for(int j=0 ; j<l-i-1 ; j++)
            {
                if(arr[j]==0 && arr[j+1]!=0)   // if current element is 0 and next element is not zero
                {
                    swap(arr,j,j+1);
                }
            }
        }
    }

    static void swap(int arr[], int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int [] arr = {0, 5, 2, 0, 9, 3, 0, 0, 11, 0};
        sort(arr);

        for (int i:arr) {
            System.out.print(i+" ");
        }
    }
}
