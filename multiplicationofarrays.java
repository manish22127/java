import java.util.Arrays;

public class multiplicationofarrays {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {10,20,30,40,50};
		int len=a.length;
		int c[]=new int[len];
		for(int i=0;i<len;i++) {
		c[i]=a[i]*b[i];}
		System.out.println("Multiplication of arrays");
		System.out.println(Arrays.toString(c));
	}
}
