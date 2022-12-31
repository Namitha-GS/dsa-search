package sorting;

public class Binary_search_using_divide_and_conquer {
	
	private static int binarySearch(int[] arr, int start, int end, int key) {
		if(start <= end) {
			int mid = (start + end) / 2;
			
			if(arr[mid] == key)
				return 1;
			
			if(arr[mid] < key)
				return binarySearch(arr, mid+1, end, key);
			else
				return binarySearch(arr, start, mid-1, key);
		}
		else
			return 0;
	}

	public static void main(String[] args) {
		int[] arr = {10, 23, 45, 70, 90, 100, 111, 123};
		int key = 111;
		if(binarySearch(arr, 0, arr.length-1, key) == 1) {
			System.out.println(key+" found");
		} else {
			System.out.println(key+" not found");
		}
	}

}
