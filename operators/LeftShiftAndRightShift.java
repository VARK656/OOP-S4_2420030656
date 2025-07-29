package mypack;
import java.util.Scanner;
public class LeftShiftAndRightShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		System.out.println("The left shift of "+n+" by 2 spaces is:"+(n<<2));
		System.out.println("The right shift of "+n+" by 2 spaces is:"+(n>>2));
		sc.close();

	}

}
