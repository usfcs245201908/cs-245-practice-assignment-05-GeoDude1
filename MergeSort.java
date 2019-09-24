public class MergeSort implements SortingAlgorithm
{
	public void sort(int [] a)
	{
		mergeSort(a, new int[a.length], 0, a.length-1);
	}

	 public static void mergeSort(int [] a, int [] temp, int leftStart, int rightEnd)
	{
		if (leftStart>=rightEnd) {
			return;
		}
		
			int mid=(leftStart+rightEnd)/2;

			mergeSort(a, temp, leftStart, mid);
			mergeSort(a, temp, mid+1, rightEnd);

			merge(a, temp, leftStart, rightEnd);
		}
		
	 public static void merge(int [] a, int [] temp, int leftStart, int rightEnd)
	{
		int leftEnd = (rightEnd+leftStart)/2;
		int rightStart = leftEnd + 1;
		int size = rightEnd-leftStart+1;

		int left = leftStart;
		int right = rightStart;
		int index = leftStart;
		
		while(left<=leftEnd && right<=rightEnd) {
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
		System.arraycopy(a,right,temp,index,rightEnd-right+1);
		System.arraycopy(temp, leftStart, a, leftStart, size);

}
}
