package controlstatements;
import java.util.Scanner;
public class GradingStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Student marks: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("Stduent Grade: ");
		if(n>=90)System.out.println("A");
		else if (n>=75&&n<90)System.out.println("B");
		else if (n>=50 && n<75)System.out.println("C");
		else if (n>=30 && n<50)System.out.println("D");
		else if (n>20&&n<30)System.out.println("E");
		else System.out.println("F");
		sc.close();
	}

}
