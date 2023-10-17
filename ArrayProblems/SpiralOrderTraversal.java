// Program to traverse and print a two-dimensional matrix in spiral order
package ArrayProblems;

import java.util.Scanner;

public class SpiralOrderTraversal {

    static void PrintInSpiral(int a[][], int r, int c)
    {
        int topRow=0,  bottomRow=r-1, leftColumn=0, rightColumn=c-1;
        int element = 0;

        while(element < r*c)                     // Traverse till all elements are printed
        {
            // In first step traverse topRow from leftColumn to rightColumn
            for(int i=leftColumn ; i<=rightColumn ; i++)
            {
                if(element<r*c)                              // Check if all elements are traversed
                {
                    System.out.print(a[topRow][i]+" ");    // Traverse each column of topRow
                }
                element++;
            }
            topRow++;

            // In second step traverse rightColumn from topRow to bottomRow
            for(int j=topRow ; j<=bottomRow ; j++)
            {
                if(element<r*c)                              // Check if all elements are traversed
                {
                    System.out.print(a[j][rightColumn]+" ");    // Traverse each row of rightColumn
                }
                element++;
            }
            rightColumn--;

            // In third step traverse bottomRow from rightColumn to leftColumn
            for(int i=rightColumn ; i>=leftColumn ; i--)
            {
                if(element<r*c)                              // Check if all elements are traversed
                {
                    System.out.print(a[bottomRow][i]+" ");    // Traverse each column of bottomRow
                }
                element++;
            }
            bottomRow--;

            // In fourth step traverse leftColumn from bottomRow to topRow
            for(int j=bottomRow ; j>=topRow ; j--)
            {
                if(element<r*c)                              // Check if all elements are traversed
                {
                    System.out.print(a[j][leftColumn]+" ");    // Traverse each row of leftColumn
                }
                element++;
            }
            leftColumn++;
        }
    }

    static void Print(int [][]a, int r, int c)
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
        System.out.println("Enter no. of rows : ");
        int r = sc.nextInt();

        System.out.println("Enter no. of columns : ");
        int c = sc.nextInt();

        int [][] a = new int[r][c];

        System.out.println("Enter array elements : ");
        for(int i=0 ; i<r ; i++)
        {
            for(int j=0 ; j<c ; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix : ");
        Print(a,r,c);
        System.out.println("Matrix in spiral order : ");
        PrintInSpiral(a,r,c);
    }
}
