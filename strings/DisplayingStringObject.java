package strings;
import java.util.Scanner;
public class DisplayingStringObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String obj Value:");
		String s = new String(sc.nextLine());
		System.out.println("Entered String: "+ s);
		System.out.println("string.lenght() = "+s.length());
		sc.close();

	}

}
