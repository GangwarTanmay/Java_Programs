package ProblemsOnArray;

import java.util.Scanner;
public class HollowRectanglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int c = sc.nextInt();

        for(int i=1 ; i<=r ; i++)
        {
            for(int j=1 ; j<=c ; j++)
            {
                if(i==1 || j==1 || i==r || j==c) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static class TargetSum {
    }
}
