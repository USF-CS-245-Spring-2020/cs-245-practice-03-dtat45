
public class BinaryRecursiveSearch implements Practice03Search {

	public int search(int [] arr,int target) {
		
		return binarySearch(arr,target,0,arr.length-1);
	}
	public int binarySearch(int[] arr,int target,int low,int high) {
		
		int median=(high+low)/2;
		if(low>high) // Base case; if the target does not exist in the array
			return -1;
		else if(target==arr[median]) // The target number index is returned if it is found in the array
			return median;
		// If the target is less than the median, the array
		// is split in half and searched in the lower half
		else if(target<arr[median])
			return binarySearch(arr,target,low,median-1);
		// If the target is greater than the median, the array
		// is split and searched in the upper half
		else 
			return binarySearch(arr,target,median+1,high);		
	}
}
