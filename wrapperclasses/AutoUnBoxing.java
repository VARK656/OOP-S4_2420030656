package wrapperclasses;

public class AutoUnBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = new Integer(10);
		int a =i;
		System.out.println("Integer class obj directly assigned to int variable where jvm performs auto-unboxing: int value = "+a);

	}

}
