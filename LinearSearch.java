public class LinearSearch implements Practice2Search {

	public int search(int [] arr, int target) {
		for(int i = arr.length-1; i >= 0; i--) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1; 
		
	}
	public String searchName() {
		
		return "Linear search";
		
	}

}