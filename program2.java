import java.util.Scanner;

public class program2 {
	Scanner s1 = new Scanner(System.in);
	static String name,address,phone_no,email,branch;
	double misc_fee,fee1,total_fee;
	int branch_code;
	
	static double ad_fee,tution_fee;
	static {
		ad_fee = 4000;
		tution_fee=45000;
	}
	
	
	program2(String name1, String address1, String phone_no1) {
		name=name1;
		address=address1;
		phone_no=phone_no1;
	}
	
	program2(String email1,String branch1){
		email=email1;
		branch=branch1;
	}

	program2() {
		System.out.println("The Default Contructor is being called");
	}

	
	
	
	public void disp(String name,String address,String phone_no){
		
		System.out.println("The entered details are :");
		System.out.println("name : "+name);
		System.out.println("Address : "+address);
		System.out.println("Phone : "+phone_no);
		
	}
	
	public void disp(String email,String branch)
	{		
		System.out.println("Email : "+email);
		System.out.println("Branch : "+branch);
	}
	
	
	public void feec(int a) {
		this.branch_code=a;
		if(this.branch_code==1) {
			this.misc_fee=60000;
		}
		if(this.branch_code==2) {
			this.misc_fee=6000;
		}
		if(this.branch_code==3) {
			this.misc_fee=30000;
		}
		System.out.println("Branch : "+branch);
		System.out.println("Branch Code : "+this.branch_code);
		System.out.println("Admission fee :"+ad_fee);
		System.out.println("Tution Fee : "+tution_fee);
		System.out.println("Miscellaneous Fee : "+misc_fee);
		
		this.total_fee=ad_fee+tution_fee+this.misc_fee;
		System.out.println("Total fee : "+this.total_fee);
		System.out.println("Thank You");

	}
	
	
	
public static void main(String[] args) {
	int i=0,a=0;
	String name = null,address = null,phone_no = null,email = null,branch = null;

	Scanner s = new Scanner(System.in);
	System.out.println("welcome to student portal");
	program2 p1 = new program2();
	
	
	while(i==0){
		System.out.println("");
		System.out.println("");
		System.out.println("______________________________________________________________");

		System.out.println("1.Enter the Details ");
		System.out.println("2.Display ");
		System.out.println("3.Calculate Fee");
		System.out.println("4.Exit");
		System.out.println("Enter your choice");
		int ch=s.nextInt();
		
		
		switch(ch) {
		case 1:
			System.out.println("Name : ");
			name=s.next();
			System.out.println("Address : ");
			address=s.next();
			System.out.println("Phone : ");
			phone_no=s.next();;
			System.out.println("Email : ");
			email=s.next();
			System.out.println("Enter the Branch\n1.MCA \n2.MBA \n3.CSE");
			System.out.println("Branch : ");
			branch=s.next();
			program2 p2 = new program2(name,address,phone_no);
			program2 p3 = new program2(email,branch);
			break;
		case 2:
			p1.disp(name,address,phone_no);
			p1.disp(email, branch);
			break;
		case 3:
			System.out.println("Enter the department code \n1.MCA \n2.MBA \n3.CSE");
			a=s.nextInt();
			p1.feec(a);
			break;
		case 4:
			System.out.println("Thankyou");
			i=1;
			break;
		default :
			System.out.println("Enter the valid option");

		}
	}
}
}
