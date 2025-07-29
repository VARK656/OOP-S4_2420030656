package mypack;
import java.util.Scanner;
public class CompundAssignment {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		n+=1;
		System.out.println("after incremented using compound assignment operator by 1: "+n);
		n-=1;
		System.out.println("after decremented by 1: "+n);
		n*=2;
		System.out.println("after multiplied by 2: "+n);
		n/=2;
		System.out.println("after getting divided by 2: "+n);
		sc.close();
	}

}
