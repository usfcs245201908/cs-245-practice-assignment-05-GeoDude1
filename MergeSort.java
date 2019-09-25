public class MergeSort implements SortingAlgorithm
{
	public void sort(int [] a)
	{
		mergeSort(a, new int[a.length], 0, a.length-1);
	}
	public static void mergeSort(int [] a, int [] temp, int l, int r)
	{
		if (l>=r) {
			return;
		}
			int mid=(l+r)/2;

			mergeSort(a, temp, l, mid);
			mergeSort(a, temp, mid+1, r);

			merge(a, temp, l, r);
		}
	public static void merge(int [] a, int [] temp, int l, int r)
	{
		int leftEnd = (r+l)/2;
		int rightStart = leftEnd + 1;
		int size = r-l+1;

		int left = l;
		int right = rightStart;
		int index = l;
		
		while(left<=leftEnd && right<=r) {
			if (a[left] <= a[right]) {
				temp[index] = a[left];
				left++;
			}
			else {
				temp[index] = a[right];
				right++;
			}
			index++;
		}
		System.arraycopy(a, left, temp, index, leftEnd-left+1);
		System.arraycopy(a,right,temp,index,r-right+1);
		System.arraycopy(temp, l, a, l, size);
	}
}
