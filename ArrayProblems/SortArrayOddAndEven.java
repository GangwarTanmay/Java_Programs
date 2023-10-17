// Program to move all the even integer at the beginning of array followed by odd integers. Relative order of array doesn't matter.
package ArrayProblems;

import java.util.Scanner;

public class SortArrayOddAndEven {

    static void swap(int a[],int i,int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static int [] move(int a[])
    {
        int start=0;
        int end=a.length-1;
        while(start<end)
        {
            if(a[end]%2 == 0 && a[start]%2==1)
            {
                swap(a,start,end);
                start++;
                end--;
            }
            if(a[start]%2==0)
            {
                start++;
            }
            if(a[end]%2 == 1)
            {
                end--;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int l = sc.nextInt();
        int a[] = new int[l];

        System.out.println("Enter array elements : ");
        for(int i=0 ; i<l ; i++)
        {
            a[i] = sc.nextInt();
        }

        int [] answer = move(a);
        System.out.println("Array after arranging : ");
        for(int i=0 ; i<l ; i++)
        {
            System.out.print(answer[i]+" ");
        }
    }

}
