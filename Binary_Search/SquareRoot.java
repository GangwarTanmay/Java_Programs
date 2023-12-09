package Binary_Search;

public class SquareRoot {

    static int findRoot(int x)
    {
        int start = 0, end = x-1;
        int root = -1;
        while(start<=end)
        {
            int mid = start+((end-start)/2);
            int square = mid*mid;

            if(square == x)
            {
                return mid;
            } else if (square > x) {
                end = mid-1;
            }
            else {
                start = mid+1;
                root = mid;
            }
        }
        return root;
    }
    public static void main(String[] args) {
        int x = 30;
        System.out.println("Square root if "+x+" is "+findRoot(x));
    }
}
