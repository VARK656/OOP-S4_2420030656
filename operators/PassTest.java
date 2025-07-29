package mypack;
import java.util.Scanner;
public class PassTest {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		boolean tm =true,pm=true;
		System.out.println("Enter the marks of the student in Theory exam out of 60");
		int th = sc.nextInt();
		System.out.println("Enter the marks of the student in Practical exam out to 40");
		int pr =sc.nextInt();
		if(th<20)tm=false;
		if(pr<10)pm=false;
		if(tm && pm)System.out.println("passed");
		else System.out.println("failed");
		sc.close();
	}

}
