// Program to find rectangle sum using prefix sum approach
package ArrayProblems;

import java.util.Scanner;

public class RectSumUsingPrefixSum{
        static void PrefixSumArray(int a[][])
        {
            for(int i=0 ; i<a.length ; i++)
            {
                a[i] = prefixSumRow(a[i]);        // Here each row is replaced by its prefix sum row
            }
        }

        static int[] prefixSumRow(int a[])         // Method to find prefix sum of each row
        {
            for(int i=1 ; i<a.length ; i++)
            {
                a[i] = a[i]+a[i-1];
            }
            return a;
        }

        static int RectangleSum(int a[][], int l1, int r1, int l2, int r2)
        {
            int sum=0;
            PrefixSumArray(a);
            for(int i=l1 ; i<=l2 ; i++)
            {
                if(r1>=1)
                    sum+= a[i][r2]-a[i][r1-1];

                else                    // in case r1=0, then no need to subtract a[i][r1-1]
                    sum+=a[i][r2];
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

            System.out.println("Sum of rectangle between boundaries ("+l1+", "+r1+") and ("+l2+", "+r2+") is : "+RectangleSum(a, l1,r1,l2,r2));
        }
    }

