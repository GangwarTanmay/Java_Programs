/* Program to search target value in 2D array using binary search.
Matrix has the following properties :
1. Integers in each row are sorted from left to right
2. The first integer of each row is greater than the last integer of previous row.

ex. a[][] = 1   3   5   7
            10  11  16  20
            23  30  34  60
    target = 16

Output : true
*/
package Binary_Search;

public class TargetIn2DArray {

    static void findTarget(int [][] a, int target)
    {
        int r = a.length;
        int c = a[0].length;
        int start = 0, end = (r*c)-1;

        while(start<=end)
        {
            int mid = start + ((end-start)/2);
            int row = mid/c;    // finding row number
            int col = mid%c;    // finding column number
            if(a[row][col] == target)
            {
                System.out.printf("Target found at (%d, %d).",row,col);
                return;
            } else if (target>a[row][col]) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        System.out.println("Target is not present in the given array.");
    }

    static void print(int [][] a)
    {
        for(int i=0 ; i<a.length ; i++)
        {
            for(int j=0 ; j<a[0].length ; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [][] a = {{10,15,27,32},{20,25,29,33},{30,35,37,39},{40,45,48,50}};
        int target = 37;
        print(a);
        findTarget(a,target);
    }
}
