package mypack;
import java.util.Scanner;
public class BitwiseOperators {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a = sc.nextInt(),b=sc.nextInt();
		System.out.println("AND operation:"+ (a&b));
		System.out.println("OR operation:"+ (a|b));
		System.out.println("XOR operation:"+ (a^b));
		System.out.println("Complement operation:"+ ~a+" "+ ~b);
		sc.close();
	}

}
