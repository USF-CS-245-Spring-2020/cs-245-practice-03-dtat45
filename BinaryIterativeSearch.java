/**
 * A class that iteratively searches for a target number by splitting the search interval in half
 * until the desired target is found or until the entire array is searched.
 * @author dtat45
 *
 */

public class BinaryIterativeSearch implements Practice03Search {
	
	public int search(int[] arr,int target) { 
		
		int low=0;
		int high=arr.length-1;
		int median=(high+low)/2;
		
		while(low<=high) {
			if(target==arr[median])
				return median;
			// If the target is less than the median, the array
			// is split in half and searched in the lower half
			if(target<arr[median]) { 
				high=median-1;
				median=(high+low)/2;
			}
			// If the target is greater than the median, the array
			// is split and searched in the upper half
			else {
				low=median+1;
				median=(high+low)/2;
			}
		}
		return -1;
	}
}
