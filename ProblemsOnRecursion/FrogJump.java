package ProblemsOnRecursion;

import java.util.Scanner;

public class FrogJump {
    static int minCost(int h[], int n, int ind)
    {
        if(ind==n-1)
        {
            return 0;
        }

        int option1 = Math.abs(h[ind]-h[ind+1])+minCost(h, n, ind+1);

        if(ind==n-2)
        {
            return option1;
        }

        int option2 = Math.abs(h[ind]-h[ind+2])+minCost(h, n, ind+2);

        return Math.min(option1,option2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int l = sc.nextInt();

        int [] h = new int[l];

        System.out.print("Enter heights : ");
        for(int i=0 ; i<l ; i++)
        {
            h[i] = sc.nextInt();
        }

        System.out.println("Minimum cost : "+minCost(h, l, 0));


    }
}
