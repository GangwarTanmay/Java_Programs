// Program to print Pascals triangle
package ProblemsOnArray;

import java.util.Scanner;

public class PascalsTriangle {

    static int [][] pascal(int n)  // Method will return the pascal triangle of order n
    {
        int ans[][] = new int[n][];   // no of columns will be defined according to each row

        for(int i=0 ; i<n ; i++) {
            ans[i] = new int[i + 1];    // each row have i+1 column
            ans[i][0] = ans[i][i] = 1; // first and last element of each row is 1

            for(int j=1 ; j<i ; j++)   // first and last element is already initialized with 1, so j start from 1
            {
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }

        return ans;
    }

    static void print(int a[][])
    {
        for(int i=0 ; i<a.length ; i++)     // a.length method find no of rows in 2D array
        {
            for(int j=0 ; j<a[i].length ; j++)   // a[i].length find no of column in each row
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();

        System.out.println("Pascal's triangle of order "+n+" : ");
        int ans[][] = pascal(n);
        print(ans);
    }
}
