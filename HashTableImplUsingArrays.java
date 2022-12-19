package searching;

import java.util.*;

public class HashTableImplUsingArrays {

	//using Linear Probing
	static final int size = 5;
	static int arr[] = new int[size];
	
	public HashTableImplUsingArrays() {
		for(int i=0; i<size; i++)
			arr[i] = -1;
	}
	
	private int insert(int value) {
		int key = value % size;
		int index = key;
		while(arr[index] != -1) {
			index = (index+1) % size;
			if(index == key) {
				System.out.println("is full");
				return 0;
			}
		}
		arr[index] = value;
		return 1;
	}
	
	private int delete(int value) {
		int key = value % size;
		int index = key;
		while(arr[index] != value) {
			index = (index+1) % size;
			if(index == key) 
				return 0;
		}
		arr[index] = -1;
		return 1;
	}
	
	private int search(int value) {
		int key = value % size;
		int index = key;
		while(arr[index] != value) {
			index = (index+1) % size;
			if(index == key) 
				return 0;
		}
		return 1;
	}
	
	public static void main(String[] args) {
		HashTableImplUsingArrays hashTbl = new HashTableImplUsingArrays();
		hashTbl.insert(10);
		hashTbl.insert(4);
		hashTbl.insert(2);
		hashTbl.insert(15);
		hashTbl.insert(5);
		
		System.out.println("After Insertion: ");
		for(int i=0; i<arr.length; i++)
	       System.out.println(arr[i]);
		
		hashTbl.delete(5);
		System.out.println("After Deletion: ");
		for(int i=0; i<arr.length; i++)
		   System.out.println(arr[i]);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to be searched: ");
		int key = sc.nextInt();
		sc.close();
		if(hashTbl.search(key) == 1) {
			System.out.println(key+" found");
		} else {
			System.out.println(key+" not found");
		}
	}

}
