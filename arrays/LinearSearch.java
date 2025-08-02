package arrays;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the elements u wants to search:");
		int target = sc.nextInt(),flag=0;
		for(int i = 0;i<n;i++)
		{
			if(arr[i]==target)
			{
				flag++;
				break;
			}
		}
		System.out.println(flag==1 ? "element found" : "Not Found");

	}

}
