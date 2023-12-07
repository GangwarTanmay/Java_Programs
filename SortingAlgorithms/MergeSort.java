package SortingAlgorithms;

public class MergeSort {

    static void merge(int [] arr, int l, int mid, int r)
    {
//
        // merge two left sub-array and right sub-array
        int i=l, j=mid+1, k=l;
        int [] result = new int[100];
        while(i<=mid && j<=r)
        {
            if(arr[i]<=arr[j])
            {
                result[k] = arr[i];
                i++;
                k++;
            }
            else
            {
                result[k] = arr[j];
                k++;
                j++;
            }
        }

        while(i<=mid)      // fill remaining elements of left sub-array in arr
        {
            result[k] = arr[i];
            i++;
            k++;
        }

        while(j<=r)     // fill remaining elements of right sub-array in arr
        {
            result[k] = arr[j];
            j++;
            k++;
        }

        for(int a=l ; a<=r ; a++)
        {
            arr[a] = result[a];
        }
    }
    static void divide(int [] arr, int l, int r)
    {
        if(l>=r)
            return;

        int mid = (l+r)/2;

        divide(arr,l,mid);       // find left sub-array
        divide(arr,mid+1,r);   // find right-sub-array
        merge(arr,l,mid,r);
    }

    static void print(int [] arr)
    {
        for (int a:arr
             ) {
            System.out.print(a+" ");
        }
    }

    public static void main(String[] args) {
        int [] a = {34,21,56,78,11,90,32,45};
        System.out.print("Unsorted array : ");
        print(a);

        divide(a,0,a.length-1);


        System.out.print("\nSorted array : ");
        print(a);
    }
}
