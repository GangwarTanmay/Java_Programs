package SortingAlgorithms;

public class InsertionSort {
    static void sort(int arr[])
    {
        int n = arr.length;
        for(int i=1 ; i<n ; i++)   // unsorted array start from 1 index
        {
            int j=i;
            while(j>0 && arr[j]<arr[j-1])  //compare and swap with each element of sorted array greater than unsorted element
            {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }
        }
    }

    public static void main(String arg[])
    {
        int [] a = {9,5,3,6,8,7,1,2};
        sort(a);
        for (int i:a) {
            System.out.print(i+" ");
        }
    }
}
