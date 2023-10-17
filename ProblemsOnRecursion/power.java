package ProblemsOnRecursion;

import java.util.Scanner;
public class power {
    static int Power(int p, int q)
    {
        if(q==0)
        {
            return 1;
        }
        return p*Power(p,q-1);
    }

    static int powerBestApproach(int p, int q)
    {
        if(q==0) {
            return 1;
        }

        if(q%2 == 0)
        {
            int ans = powerBestApproach(p,q/2);
            return ans*ans;
            }

        // when q is odd
        int ans = powerBestApproach(p,q/2);
        return p*ans*ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base : ");
        int p = sc.nextInt();

        System.out.print("Enter exponent : ");
        int q = sc.nextInt();

        System.out.println(p+"^"+q+" = "+powerBestApproach(p,q));
    }
}
