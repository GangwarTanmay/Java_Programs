package Binary_Search;

import java.util.Scanner;
public class BinarySearch {

    // first we have to sort the array
    // sort using quickSort
    static void sort(int [] a, int start, int end)
    {
        if(start>=end)
            return;

        int pivotIndex = partition(a, start, end);
        sort(a,start,pivotIndex-1);
        sort(a,pivotIndex+1, end);
    }

    static int partition(int [] a, int start, int end)
    {
        int l = start;
        int h = end;
        int pivot = start;

        while(l<h)
        {
            while(l<h && a[l]<=a[pivot])
            {
                l++;
            }

            while(a[h]>a[pivot])
            {
                h--;
            }

            if(l<h)
            {
                int temp = a[l];
                a[l] = a[h];
                a[h] = temp;
            }
        }

        int temp = a[start];
        a[start] = a[h];
        a[h] = temp;

        return h;
    }

    static void search(int [] a, int l, int h, int target)
    {
        sort(a, l, h);
        System.out.print("Sorted array : ");
        print(a);

        while(l<=h)
        {
            int mid = (l+h)/2;
            if(target < a[mid])
            {
                h = mid-1;
            } else if (target>a[mid]) {
                l = mid+1;
            }
            else {
                System.out.println("Target is present in array.");
                return;
            }
        }
        System.out.println("Target not present.");
    }

    static void recursiveSearch(int [] a, int start, int end, int target)
    {
        if(start>end)
        {
            System.out.println("Target not present");
            return;
        }
        int mid = (start+end)/2;
        if(target < a[mid])
        {
            recursiveSearch(a,start,mid-1,target);

        }
         else if (target > a[mid])
        {
            recursiveSearch(a,mid+1,end,target);
        }
        else {
            System.out.print("Target present");
            return;
        }
    }
    static void print(int [] a)
    {
        for (int element:a) {
            System.out.print(element+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length : ");
        int n = sc.nextInt();

        int [] a = new int[n];
        System.out.println("Enter array elements : ");
        for(int i=0 ; i<n ; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter target : ");
        int target = sc.nextInt();

        sort(a,0,n-1);
        print(a);
        recursiveSearch(a,0,n-1,target);

        //search(a,0,n-1, target);
    }
}
