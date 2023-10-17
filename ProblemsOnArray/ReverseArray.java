// Program to reverse an array without using second array.
package ProblemsOnArray;

import java.util.Scanner;

public class ReverseArray {
    static void reverseArray(int a[])
    {
        int j=a.length-1;
        int i=0;
        while(i<=j)
        {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        System.out.println("Reversed array --");
        for(int k=0 ; k<a.length ; k++)
        {
            System.out.print(a[k]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length : ");
        int l = sc.nextInt();
        System.out.println("Enter array elements : ");
        int a[] = new int[l];
        for(int i=0 ; i<l ; i++)
        {
            a[i] = sc.nextInt();
        }
        reverseArray(a);

    }
}
