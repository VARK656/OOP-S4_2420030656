package controlstatements;
import java.util.Scanner;
public class PrintNumberTillN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = sc.nextInt();
		for(int i = 1;i<=n;i++)System.out.print(i+" ");
		sc.close();
	}

}
