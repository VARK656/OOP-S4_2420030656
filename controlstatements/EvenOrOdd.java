package controlstatements;
import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		System.out.println((n%2==0)?n+" is even":n+" is odd");
		sc.close();
	}

}
