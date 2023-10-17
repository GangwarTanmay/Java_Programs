// Program to find transpose of non-square matrix
package ProblemsOnArray;

import java.util.Scanner;

public class TransposeNonSquareMatrix {
    static int [][] Transpose(int a[][], int r, int c)
    {
        int [][] answer = new int [c][r]; // The order of transpose matrix is reverse that of the original matrix
        for(int i=0 ; i<c ; i++)
        {
            for(int j=0 ; j<r ; j++)
            {
                answer[i][j] = a[j][i];
            }
        }
        return answer;
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

        int ans[][] = Transpose(a,r,c);
        System.out.println("Original matrix is : ");
        print(a,r,c);
        System.out.println("Transpose of matrix is : ");
        print(ans,c,r);
    }
}
