package mypack;
import java.util.Scanner;
public class CompareIntegers {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers to compare");
		int a = sc.nextInt(),b=sc.nextInt();
		if(a>b)
		{
			System.out.println(a+ " is greater than "+b);
		}
		else if(a==b)System.out.println("both are equal");
		else
		{
			System.out.println(b+ " is greater than "+a);
		}
		sc.close();
	}

}
