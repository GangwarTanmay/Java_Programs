/*
Program to search in 2D array having the following properties :
1. Integers are sorted from left to right
2. Integers in each column are sorted in ascending order from top to bottom

Input : a[][] = 2   4   6   8
                5   6   7   20
                7   11  13  25
                12  14   17  30

        target = 14
Output : true
 */
package Binary_Search;

public class SearchIn2DArray_II {

    static void searchTarget(int [][] a, int target)
    {
        int r = a.length;
        int c = a[0].length;
        int i = 0, j=c-1;

        while(i<r && j>=0)
        {
            if(target < a[i][j])
                j--;   // move left

            else if(target > a[i][j])
                i++;

            else {
                System.out.printf("Target found at (%d, %d).", i, j);
                return;
            }
        }
        System.out.println("Target not present in given array");
    }

    public static void main(String[] args){
        int [][] a = {{2,4,6,8},{5,6,7,20},{7,11,13,25},{12,14,17,30}};
        int target = 14;
        searchTarget(a,target);
    }
}
