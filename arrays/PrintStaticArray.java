package arrays;

import java.util.Arrays;

public class PrintStaticArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		System.out.print("using for loop:");
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Using Arrays.toString method:"+Arrays.toString(arr));

	}

}
