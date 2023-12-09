/*
Given an array of size N containing only 0s, 1s and 2s. Sort the array in ascending order.
input : arr[] = {0, 2, 1, 2, 0, 0}
output : arr[] = {0, 0, 0, 1, 2, 2}
 */
package SortingAlgorithms;

public class problem4 {

    static void swap(int [] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void bestApproach(int [] arr)
    {
        int low = 0, mid = 0, high = arr.length-1;
        while(mid<=high)
        {
            if(arr[mid] == 0)
            {
                swap(arr,mid,low);
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else
            {
                swap(arr,mid,high);
                high--;
            }
        }
    }

    static void countSort(int [] arr)
    {
        int [] countArray = new int[3];
        for(int i=0 ; i<arr.length ; i++)
        {
            countArray[arr[i]]++;
        }

        int k=0;
        for(int i=0 ; i<countArray.length ; i++)
        {
            for(int j=0 ; j<countArray[i] ; j++)
            {
                arr[k] = i;
                k++;
            }
        }
    }

    static void print(int [] arr)
    {
        for(int element : arr)
        {
            System.out.print(element+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr = {0, 2, 1, 1, 0, 0, 1, 0, 1, 0, 0};
        //countSort(arr);
        bestApproach(arr);
        print(arr);
    }
}
