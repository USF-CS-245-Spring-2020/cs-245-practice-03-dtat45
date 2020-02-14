/**
 * A class that repeatedly swaps the adjacent elements if they are in the wrong
 * order until the entire array is sorted.
 * @author Dan Tat
 *
 */
public class BubbleSort implements Practice03Sort {

	public void sort(int[] a) {
		
		boolean swapped=true;
		// The algorithm continues to sort as long as 
		// elements are still being swapped
		while(swapped==true) { 
			swapped=false;
			// Goes through each element, comparing if the element 
			// in front is in the correct order
			for(int i=0;i<a.length-1;i++) { 
				if(a[i]>a[i+1]) {
					swap(a,i,i+1);
					swapped=true;
				}
			}
		}
	}
	public void swap(int[] array,int a,int b) { // Swaps the elements of two given indices
		
		int temp=array[a];
		array[a]=array[b];
		array[b]=temp;
	}
	
}
