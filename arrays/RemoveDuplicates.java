package arrays;
import java.util.Scanner;
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Unique Elements: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[i]==arr[j]&&i!=j)
				{
					arr[j]=-1;
					
				}				
			}
		}
		for(int i = 0;i<n;i++)
		{
			if(arr[i]>=0)
			System.out.print(arr[i]+" ");
		}
		

	} 

}
