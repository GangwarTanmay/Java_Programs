// Given a matrix 'a' of dimension nxm and 2 coordinated (l1,r1) and (l2,r2). Return the sum of rectangle from (l1,r1) to (l2,r2)
package ProblemsOnArray;

import java.util.Scanner;

public class RectangleSum {
    static int Sum(int a[][], int l1, int r1, int l2, int r2)
    {
        int sum=0;

        for(int i=l1; i<=l2; i++)
        {
            for(int j=r1; j<=r2; j++)
            {
                sum = sum+a[i][j];
            }
        }
        return sum;
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

        System.out.println("Sum of rectangle between coordinates ("+l1+", "+r1+") and ("+l2+", "+r2+") is : "+Sum(a, l1,r1,l2,r2));
    }
}
