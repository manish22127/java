import java.util.Scanner;

public class characterarray {
public static void main(String[] args) {
	String s1;
	Scanner s = new Scanner(System.in);
	System.out.println("enter a string");
	s1=s.next();
	char[] a=s1.toCharArray();
	System.out.println(a);
}
}
