/**
 * A class that searches for a target number in an array by comparing each
 * item in the array until the target is found or the entire array is searched.
 * @author Dan Tat
 *
 */

public class LinearSearch implements Practice03Search {
	
	public int search(int [] arr,int target) {
		
		for(int i=0;i<arr.length;i++) { // Checks through the entire array if the target is within the array
			if(arr[i]==target)
				return i;
		}
		return -1; // -1 is returned if the target is not in array
	}
}
