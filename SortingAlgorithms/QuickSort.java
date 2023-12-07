package SortingAlgorithms;

public class QuickSort {

    static void swap(int [] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void quickSort(int [] a, int l, int h)
    {
        if(l<h)
        {
            int pivotIndex = partition(a,l,h);
            quickSort(a,l,pivotIndex-1);    //sort left sub-array
            quickSort(a,pivotIndex+1,h);    // sort right sub-array
        }
    }
    static int partition(int [] a, int l, int h)
    {
        int pivot = a[l];
        int i = l;
        int j = h;

        while(i< j) {
            while (i<j && a[i] <= pivot)      // move i forward till condition is true
            {
                i++;
            }

            while (a[j] > pivot)      // move j backward till condition is true
            {
                j--;
            }

            // swap a[i] and a[j]
            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        // when i becomes > j, swap a[j] with pivot i.e., a[l]
        int temp = a[l];
        a[l] = a[j];
        a[j] = temp;

        return j;         // return the correct position of pivot element
    }
    public static void main(String[] args) {
        int [] a = {55, 13, 87, 100, 12, 11, 37, 64};
        quickSort(a,0,7);
        System.out.print("Sorted Array : ");
        for (int element:a) {
            System.out.print(element+" ");
        }
    }
}
