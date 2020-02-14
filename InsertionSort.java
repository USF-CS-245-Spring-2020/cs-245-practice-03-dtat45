/**
 * A class that sorts an array by repeatedly shifting elements, at the left side of the array,
 * to the right until the element being sorted is in the correct position.
 * @author Dan Tat
 *
 */
public class InsertionSort implements Practice03Sort {

	public void sort(int[] a) {
		
		int temp;
		for(int i=1;i<a.length;i++) {
			temp=a[i]; // Holds the value of the element that is being sorted
			int j=1;
			while(i>=j && temp<a[i-j]) { // Shifts elements that are greater than the element being sorted to the right
				a[i-(j-1)]=a[i-j];
				++j;
			}
			a[i-(j-1)]=temp; // Places the element being sorted into its correct position in the array
		}
	}
}
