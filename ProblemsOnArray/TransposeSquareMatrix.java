package ProblemsOnArray;

import java.util.Scanner;

public class TransposeSquareMatrix {
    static void Transpose(int a[][], int r, int c)
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
        System.out.print("Enter no. of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter no. of columns : ");
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

        System.out.println("Original matrix is : ");
        print(a,r,c);
        System.out.println("Transpose of matrix is : ");
        Transpose(a,r,c);
        print(a,r,c);
    }
}
