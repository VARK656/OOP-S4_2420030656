package mypack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ArthimeticOperators {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		InputStreamReader sc = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(sc);
		System.out.println("Enter the values of 2 numbers");
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		System.out.println("The Addition of "+a+" and "+b+" is: "+(a+b));
		System.out.println("The Subtraction of "+a+" and "+b+" is: "+(a-b));
		System.out.println("The Multiplication of "+a+" and "+b+" is: "+(a*b));
		System.out.println("The Division of "+a+" and "+b+" is: "+(a/b));
		System.out.println("The Modulo operation of "+a+" and "+b+" is: "+(a%b));

	}

}
