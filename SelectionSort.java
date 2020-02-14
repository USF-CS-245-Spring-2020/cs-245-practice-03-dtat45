/**
 * A class that sorts a given array by repeatedly searching for the smallest element and
 * swapping it into the beginning of the unsorted part of the array.
 * @author Dan Tat
 *
 */
public class SelectionSort implements Practice03Sort {
	
	public void sort(int[] a) {
		
		int minNum; // Index that denotes the current minimum value in the current sub-array
		for(int i=0;i<a.length;i++) { // Keeps track of the position the next minimum element will be placed
			minNum=i;
			for(int j=1+i;j<a.length;j++) { // Checks sub-array for the next minimum element
				if(a[j]<a[minNum])
					minNum=j;
			}
			swap(a,i,minNum);
		}
	} // selection sort
	public void swap(int[] a,int targetPosition,int minNum) {
		
		int temp=a[targetPosition];
		a[targetPosition]=a[minNum];
		a[minNum]=temp;
	}

}
