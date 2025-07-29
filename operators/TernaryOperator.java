package mypack;
import java.util.Scanner;
public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a 2 numbers");
	    int n = sc.nextInt(),m=sc.nextInt();
	    System.out.println(((n>m)? n+" is greater" : m+" is greater"));
	    sc.close();

	}

}
