package SortingAlgorithms;

public class SelectionSort {
    static void sort(int [] arr)
    {
        int n = arr.length;
        for(int i=0 ; i<n-1 ; i++)
        {
            for(int j=i+1 ; j<n ; j++)
            {
                if(arr[j]<arr[i])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int a [] = {7,8,3,4,9,1,2,5};
        sort(a);
        for (int i:a) {
            System.out.print(i+" ");

        }
    }
}
