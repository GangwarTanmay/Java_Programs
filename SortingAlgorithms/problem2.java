/*
Given an array where all its element are sorted in increasing order except two swapped elements, sort it in linear time.
input : a[] = {3, 8, 6, 7, 5, 9, 10}
output : a[] = {3, 5, 6, 7, 8, 9, 10}
 */
package SortingAlgorithms;

public class problem2 {
    static void sort(int [] arr)
    {
    int x=-1, y=-1;
    for(int i=1 ; i<arr.length ; i++)
    {
        if(arr[i-1]>arr[i])
        {
            if(x==-1) {         // if x is -1 then i-1 is the first element to be swaped
                x = i - 1;      // first element to be swapped
                y = i;
            }
            else {              // if x != -1, means first element is already found, hence element at ith index is second conflict element
                y=i;
            }
        }
    }

    // Now swap the conflict elements x and y
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int [] arr = {3, 8, 6, 7, 5, 9, 10};
        sort(arr);

        for(int element:arr)
        {
            System.out.print(element+" ");
        }
    }
}
