// Program to return max element of array using recursion
package ProblemsOnRecursion;

public class MaxElementArray {
    static int Maximum(int a[], int ind)
    {
        if(ind==a.length-1)
            return a[ind];

        return Math.max(Maximum(a,ind+1), a[ind]);
    }

    public static void main(String[] args) {
        int [] a = {23,78,5,12,98,73};
        System.out.println(Maximum(a,0));
    }
}
