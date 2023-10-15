package practiceProblems;

import java.util.Scanner;

public class SortZeroOneTwo {

    static void SortArray(int a[])
    {
        int i=0, j=a.length-1;
        while(i<j)
        {
            if(a[i]==2 && a[j]==0)
            {
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                i++;
                j--;
            }
            if(a[i]==0)
            {
                i++;
            }
            if(a[j]==2)
            {
                j--;
            }
            if (a[i] == 1) {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length : ");
        int l = sc.nextInt();

        int a[] = new int[l];
        System.out.println("Enter array elements : ");
        for(int i=0 ; i<a.length ; i++)
        {
            a[i] = sc.nextInt();
        }

        SortArray(a);
        System.out.println("Sorted : ");
        for(int j=0 ; j<l ; j++)
        {
            System.out.print(a[j]+" ");
        }
    }
}
