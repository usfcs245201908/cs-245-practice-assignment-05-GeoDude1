public class QuickSort implements SortingAlgorithm {
    public void sort(int[] a) {
        quick(a, 0 , a.length-1);
    }
    public void quick(int[] a, int l, int r)
    {
        if (l < r ){
            int p = partition (a, l, r);
            quick(a, l, p-1);
            quick(a, p+1, r);
        }
    }
    public int partition(int[] a, int l, int r)
    {
        if(l < r) {
            int pivot = l;
            int i = l + 1;
            int j = r;
            while (i < j) {
                while (i < r && a[i] <= a[pivot])
                    ++i;
                while (j >= i && a[j] > a[pivot])
                    --j;
                if (i < j)
                    swap(a, i, j);
            }
            swap(a, j, pivot);
            return j;
        }
        return l;
    }
    public void swap(int [] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}