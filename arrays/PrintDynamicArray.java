package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class PrintDynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int n = sc.nextInt();
		int arr [] = new int[n];
		System.out.println("Enter "+n+" elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Entered Array: ");
		System.out.println(Arrays.toString(arr));
				

	}

}
