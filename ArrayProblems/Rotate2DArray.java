// Program to rotate a 2D array by 90 degree
// Approach : find transpose of matrix then reverse each row of matrix
package ArrayProblems;

import java.util.Scanner;

public class Rotate2DArray {
    static void transpose(int a[][], int r, int c)
    {
        for(int i=0 ; i<r ; i++)
        {
            for(int j=i ; j<c ; j++)
            {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }

    static void rotate(int a[][], int r, int c)
    {
        for(int i=0 ; i<r ; i++)
        {
            int start = 0 , end = c-1;
            while(start<end)                 // reversing each row
            {
                int temp = a[i][start];
                a[i][start] = a[i][end];
                a[i][end] = temp;
                start++;
                end--;
            }
        }
    }
    static void print(int a[][], int r, int c)
    {
        for(int i=0 ; i<r ; i++)
        {
            for(int j=0 ; j<c ; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter no of columns : ");
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

        System.out.println("\nOriginal Array : ");
        print(a,r,c);
        System.out.println("\nMatrix after 90 degree rotation: ");
        transpose(a,r,c);
        rotate(a,r,c);
        print(a,r,c);
    }
}
