package searching;
import java.util.*;

public class LinearSearch {
	
	public static int linearSearch(int[] arr, int size, int key) {
		for(int i=0; i< size; i++) {
			if(arr[i] == key)
				return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		int pge_no[] = {86, 91, 34, 50, 0};
		System.out.print("Enter key to be searched:");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		sc.close();
		
		if(linearSearch(pge_no, pge_no.length, key) == 1)
			System.out.println(key+" found");
		else
			System.out.println(key+" not found");
	}

}
