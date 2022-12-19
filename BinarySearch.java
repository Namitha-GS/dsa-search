package searching;

import java.util.*;

public class BinarySearch {
	
	private static int binarySearch(int[] arr, int start, int end, int key) {
		int mid;
		while(start <= end) {
			mid = (start + end) / 2;
			
			if(arr[mid] == key)
				return 1;
			
			if(arr[mid] < key)
				start = mid + 1;
			else
				end = mid - 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] arr = {10, 23, 45, 70, 90, 100, 111, 123};
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Key to be searched: ");
		int key = sc.nextInt();
		sc.close();
		if(binarySearch(arr, 0, 7, key) == 1) {
			System.out.println(key + " found");
		} else {
			System.out.println(key + " not found");
		}
	}

}
