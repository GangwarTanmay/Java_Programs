// Program to multiply two 2d arrays
package ProblemsOnArray;

import java.util.Scanner;

public class MultiplicationOf2DArray {
    static int [][] mutliply(int a[][],int r1, int c1, int b[][], int r2, int c2)
    {
        int ans[][] = new int[r1][c2];
       for(int i=0 ; i<r1 ; i++)
       {
           for(int j=0 ; j<c2 ; j++)
           {
               for(int k=0 ; k<c1 ; k++)
               {
                ans[i][j] = ans[i][j] + a[i][k]*b[k][j];
               }
           }
       }
       return ans;
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
        System.out.println("Enter no of rows of first array : ");
        int r1 = sc.nextInt();
        System.out.println("Enter no of columns of first array : ");
        int c1 = sc.nextInt();

        int a[][] = new int[r1][c1];

        System.out.println("Enter elements of first array : ");
        for(int i=0 ; i<r1 ; i++)
        {
            for(int j=0 ; j<c1 ; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter no of rows of second array : ");
        int r2 = sc.nextInt();
        System.out.println("Enter no of columns of second array : ");
        int c2 = sc.nextInt();
        int b[][] = new int[r2][c2];

        System.out.println("Enter elements of second array : ");
        for(int i=0 ; i<r2 ; i++)
        {
            for(int j=0 ; j<c2 ; j++)
            {
                b[i][j] = sc.nextInt();
            }
        }

        if(c1 != r2)
        {
            System.out.println("Multiplication of arrays not possible.");
        }
        else{
            int c[][] = mutliply(a,r1,c1,b,r2,c2);
            System.out.println("Multiplication of both arrays is : ");
            print(c,r1,c2);     // The order of resultant matrix is r1 x c2
        }
    }
}
