package arrays;
import java.util.Scanner;
public class SixSubjectsMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int marks[] = new int [6];
		for(int i=0;i<6;i++)
		{
			System.out.println("Enter Subject "+(i+1)+"Marks: ");
			marks[i]=sc.nextInt();
		}
		int total=0;
		for(int i = 0;i<6;i++)
		{
			total+=marks[i];
			System.out.println("Subject "+(i+1)+"marks: "+marks[i]);
		}
		System.out.println("Total marks: "+total);
		System.out.println("Avg: "+(total/6));

	}

}
