package strings;
import java.util.Scanner;
public class PrintString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String:");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("Entered String is : "+s);
		sc.close();
	}

}
