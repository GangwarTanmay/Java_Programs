package SortingAlgorithms;

public class CountSort {

    static int findMax(int [] a)
    {
        int max = a[0];
        for(int i=0 ; i<a.length ; i++)
        {
            if(a[i]>max)
                max = a[i];
        }
        return max;
    }
    static void sort(int [] a)
    {
        int l = findMax(a);
        int [] countArray = new int[l+1];  // the length of count array would be max element of given array + 1

            for(int j=0 ; j<a.length ; j++)
            {
                countArray[a[j]]+=1;
            }

            int k=0;

            for(int x=0 ; x<countArray.length ; x++)
            {
                for(int b=0 ; b<countArray[x] ; b++)
                {
                    a[k] = x;
                    k++;
                }
            }
    }

    static void print(int [] arr)
    {
        for (int i:
             arr) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int [] a = {1,34,21,54,34,21,1,22,1,34};
        sort(a);
        System.out.print("Sorted array : ");
        print(a);
    }
}
