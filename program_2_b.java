import java.util.Scanner;
import two_b.*;
public class program_2_b {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		square s1 = new square();
		triangle t= new triangle();
		circle c= new circle();
		int flag=1;
		while (flag!=0) {
			System.out.println("1.Area of square \n2.Area circle \n3.Area of triangle \n4.Exit \nEnter ur choice");
			int ch= s.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter side value");
				float side= s.nextFloat();
				s1.calcarea(side);
				
				float cens[] = new float[2];
				cens=s1.center_point(side);
				System.out.println("Height :"+cens[0]);
				System.out.println("width :"+cens[1]);
				break;
			case 2:
				System.out.println("Enter radius value");
				float radius= s.nextFloat();
				c.calcarea(radius);
				
				
				float cen[] = new float[2];
				cen=c.center_point(radius);
				System.out.println("Height :"+cen[0]);
				System.out.println("width :"+cen[1]);
				
				break;
			case 3:
				System.out.println("Enter base value");
				float base= s.nextFloat();
				System.out.println("Enter height value");
				float height= s.nextFloat();
				t.calcarea(base,height);
				
				float cent[] = new float[2];
				cent=t.center_point(base,height);
				System.out.println("Height :"+cent[0]);
				System.out.println("width :"+cent[1]);
				break;
			case 4:
				flag=0;
				System.out.println("Successfully exitted \nThank You4 ");
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
			
		}
	}

}

