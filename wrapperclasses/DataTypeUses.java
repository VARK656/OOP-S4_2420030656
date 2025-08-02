package wrapperclasses;
import java.util.Scanner;
public class DataTypeUses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter int data: ");
		int a = sc.nextInt();
		System.out.println("Enter char data: ");
		char s = sc.next().charAt(0);
		System.out.println("Enter float data: ");
		float f = sc.nextFloat();
		System.out.println("Enter Double data: ");
		double d = sc.nextDouble();
		System.out.println("Enter Boolean data: ");
		boolean tf = sc.nextBoolean();
		System.out.println("Entered Data:");
		System.out.println("Int: "+a);
		System.out.println("Char: "+s);
		System.out.println("Float: "+f);
		System.out.println("Double: "+d);
		System.out.println("Boolean: "+tf);
		sc.close();

	}

}
