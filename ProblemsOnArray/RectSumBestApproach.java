package ProblemsOnArray;

import java.util.Scanner;

public class RectSumBestApproach {

    // Method will find prefixSum row-wise as well as column-wise
    static void PrefixSumRowCol(int a[][])
    {
        int r = a.length;
        int c = a[0].length;

        // find prefix sum row-wise
        for(int i=0 ; i<r ; i++)
        {
            for(int j=1 ; j<c ; j++)
            {
                a[i][j] += a[i][j-1];
            }
        }

        // find prefix Sum column wise
        for(int j=0 ; j<c ; j++)
        {
            for(int i=1 ; i<r ; i++)
            {
                a[i][j] += a[i-1][j];
            }
        }

//        System.out.println("Prefix sum array : ");
//        print(a);
    }

    static int RectangleSum(int a[][], int l1, int r1, int l2, int r2)
    {
        int SumOfRectangle=0,  UpperRectangle=0, leftRectangle=0, commonRectangle=0;
        PrefixSumRowCol(a);

        int TotalRectangleSum = a[l2][r2];

        if(l2>0)
        {
            UpperRectangle = a[l1-1][r2];
        }
        if(l1>0)
        {
            leftRectangle = a[l2][r1-1];
        }
        if(l1>0 && r1>0)
        {
            commonRectangle = a[l1-1][r1-1];
        }

        SumOfRectangle = TotalRectangleSum - UpperRectangle - leftRectangle + commonRectangle;
        return  SumOfRectangle;
    }
    static  void print(int a[][])
    {
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of row : ");
        int r = sc.nextInt();

        System.out.print("Enter no. of column : ");
        int c = sc.nextInt();

        int a[][] = new int[r][c];

        System.out.println("Enter array elements : ");
        for(int i=0 ; i<r ; i++)
        {
            for(int j=0 ; j<c ; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original matrix : ");
        print(a);

        System.out.print("Enter first coordinates (l1, r1) : ");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();

        System.out.print("Enter second coordinates (l2, r2) : ");
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("Sum of rectangle between coordinates ("+l1+", "+r1+") and ("+l2+", "+r2+") is : "+RectangleSum(a, l1,r1,l2,r2));
    }
}
