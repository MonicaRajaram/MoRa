package week1.day2;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		// step 1: sort the array : Arrays.sort(numArr);
        // step 2: print the sorted array
        // step 3: find the largest number (last element)
        // step 4: find the smallest number (first element)
		
		int Arr[] = {23,45,33,390,10,200,90,1000,3,1} ;
		Arrays.sort(Arr);
		System.out.println(Arr);
		for(int i=0;i<Arr.length;i++) {
			System.out.println(Arr[i]);
		}
		//int first = Arr[0];
		System.out.println("first "+Arr[0]);
		//int last = Arr[Arr.length-1];
				
		System.out.println("last "+ Arr[Arr.length-1]);
		

	}

}
