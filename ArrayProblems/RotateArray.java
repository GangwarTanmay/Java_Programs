/* Program to rotate array by k steps
for e.g., arr[] = {1, 2, 3, 4, 5}
after 1 rotation
arr[] = {5,1,2,3,4}
 */
package ArrayProblems;

import java.util.Scanner;

public class RotateArray {

    static void rotateArray(int arr[])
    {
        int l = arr.length;
        int temp = arr[l-1];   // storing last element in temporary variable
        for(int i=l-1 ; i>=1 ; i--)   // Loop to shift array elements
        {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;  // placing element at last index at first(0) index
    }

    static void printArray(int arr[])
    {
        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int l = sc.nextInt();
        int a[] = new int[l];
        System.out.println("Enter array elements : ");
        for(int i=0 ; i<l ; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("How many times you want to rotate the array : ");
        int k = sc.nextInt();

        k = k%l;   /* for array of length 5, the k=5 times rotation will give the same array as original one(i.e., we need to perform 0
                    rotation) similarly for k=6 times rotation, the array will be same as that of array after 1 time rotation */

        for(int i=1 ; i<=k ; i++)
        {
            rotateArray(a);
        }

        System.out.println("Array after "+k+" rotations : ");
        printArray(a);
    }
}
