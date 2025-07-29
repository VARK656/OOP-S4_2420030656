package controlstatements;
import java.util.Scanner;
public class CheckIfPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		if(n>0)System.out.println(n+" is positive");
		else if(n==0) System.out.println(n+" is equal to 0");
		else System.out.println(n+" is negetive");
		sc.close();
	}

}
