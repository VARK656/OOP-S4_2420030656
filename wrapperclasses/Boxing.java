package wrapperclasses;
import java.util.Scanner;
public class Boxing {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter int data for wrapping");
		int a = sc.nextInt();
		Integer i = new Integer(a);
		System.out.println("Entered int is converted into Integer class object and result = "+i);
	}

}
