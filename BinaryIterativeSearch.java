public class BinaryIterativeSearch implements Practice2Search {
	
	public int search (int [] arr, int target) {
		
		int low = 0;
		int high = arr.length-1;
		int mid = (high)/2; 
		int found = -1; 
		
		while(high>low) {
			
			if(arr[mid] == target ) {
				
				found = mid;
				return found;
				
			} else if (arr[mid] > target) {
				
				high = mid-1;
				mid = high /2;
				
			} 
			low = mid+1;
			mid = (high+low)/2;
		}
		
		return found; 
		
	}
	public String searchName() {
		return "Binary Iterative search";
	}
}