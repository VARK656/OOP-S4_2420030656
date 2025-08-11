package strings;
import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to perform String Operations:");
        String s = new String(sc.nextLine());
        System.out.println("s.length() = " + s.length());
        System.out.println("Enter the index of charAt(int index):");
        int idx = sc.nextInt();
        System.out.println("s.charAt(" + idx + ") = " + s.charAt(idx));
        System.out.println("Enter the beginning index of substring(int beginIndex):");
        int beg1 = sc.nextInt();
        System.out.println("s.substring(" + beg1 + ") = " + s.substring(beg1));
        System.out.println("Enter the beginning and last index of substring(int beginIndex, int endIndex)");
        System.out.print("Beginning index: ");
        int beg = sc.nextInt();
        System.out.print("End index: ");
        int end = sc.nextInt();
        System.out.println("s.substring(" + beg + "," + end + ") = " + s.substring(beg, end));
        sc.nextLine();
        System.out.println("Enter another string for equals(String anotherString):");
        String s2 = sc.nextLine();
        System.out.println("s.equals(\"" + s2 + "\") = " + s.equals(s2));
        System.out.println("s.equalsIgnoreCase(\"" + s2 + "\") = " + s.equalsIgnoreCase(s2));
        System.out.println("s.compareTo(\"" + s2 + "\") = " + s.compareTo(s2));
        System.out.println("s.compareToIgnoreCase(\"" + s2 + "\") = " + s.compareToIgnoreCase(s2));
        System.out.println("Enter a substring for contains(CharSequence s):");
        String subStr = sc.nextLine();
        System.out.println("s.contains(\"" + subStr + "\") = " + s.contains(subStr));
        System.out.println("Enter a prefix for startsWith(String prefix):");
        String prefix = sc.nextLine();
        System.out.println("s.startsWith(\"" + prefix + "\") = " + s.startsWith(prefix));
        System.out.println("Enter a suffix for endsWith(String suffix):");
        String suffix = sc.nextLine();
        System.out.println("s.endsWith(\"" + suffix + "\") = " + s.endsWith(suffix));
        System.out.println("Enter a string for indexOf(String str):");
        String find1 = sc.nextLine();
        System.out.println("s.indexOf(\"" + find1 + "\") = " + s.indexOf(find1));
        System.out.println("Enter a string for lastIndexOf(String str):");
        String find2 = sc.nextLine();
        System.out.println("s.lastIndexOf(\"" + find2 + "\") = " + s.lastIndexOf(find2));
        System.out.println("s.trim() = \"" + s.trim() + "\"");
        System.out.println("Enter old char for replace:");
        char oldChar = sc.nextLine().charAt(0);
        System.out.println("Enter new char for replace:");
        char newChar = sc.nextLine().charAt(0);
        System.out.println("s.replace('" + oldChar + "','" + newChar + "') = " + s.replace(oldChar, newChar));
        System.out.println("Enter regex for replaceAll:");
        String regex1 = sc.nextLine();
        System.out.println("Enter replacement for replaceAll:");
        String repl1 = sc.nextLine();
        System.out.println("s.replaceAll(\"" + regex1 + "\",\"" + repl1 + "\") = " + s.replaceAll(regex1, repl1));
        System.out.println("Enter regex for replaceFirst:");
        String regex2 = sc.nextLine();
        System.out.println("Enter replacement for replaceFirst:");
        String repl2 = sc.nextLine();
        System.out.println("s.replaceFirst(\"" + regex2 + "\",\"" + repl2 + "\") = " + s.replaceFirst(regex2, repl2));
        System.out.println("s.toLowerCase() = " + s.toLowerCase());
        System.out.println("s.toUpperCase() = " + s.toUpperCase());

        System.out.print("s.toCharArray() = ");
        char[] arr = s.toCharArray();
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("s.isEmpty() = " + s.isEmpty());

        System.out.println("Enter an integer to test valueOf(anyType):");
        int num = sc.nextInt();
        System.out.println("String.valueOf(" + num + ") = " + String.valueOf(num));
        sc.close();
    }
}
