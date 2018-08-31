public class BinaryRecursiveSearch implements Practice2Search {

	public int search(int [] arr, int target) {
		int high = arr.length-1;
		int low = 0;
		
		return search(arr,target, high, low);
	}
	
	public int search(int [] arr, int target, int high, int low) {

		int mid = (high + low )/2;
		
		if(high < low) {
			
			return -1;
			
		} else if(arr[mid] == target) {
			
			return mid;
			
		} else if (arr[mid] > target) {
			
			return search(arr, target, mid-1, low);
			
		} else 
			
			return search(arr,target,high,mid+1);
		
	}
	public String searchName() {
		
		return "Binary Recursive Search";
		
	}
	
}