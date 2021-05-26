import java.util.Scanner;

public class program1 {
	Scanner s1 = new Scanner(System.in);
	String name,address,phone_no,email,branch;
	double ad_fee=4000,misc_fee,tution_fee=45000,fee1,total_fee;
	int branch_code;
	
	
	public void disp(String name,String address,String phone_no,String email,String branch){
		this.name=name;
		this.address=address;
		this.phone_no=phone_no;
		this.email=email;
		this.branch=branch;
		System.out.println("The entered details are :");
		System.out.println("name : "+this.name);
		System.out.println("Address : "+this.address);
		System.out.println("Phone : "+this.phone_no);
		System.out.println("Email : "+this.email);
		System.out.println("Branch : "+this.branch);
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
		System.out.println("Branch : "+this.branch);
		System.out.println("Branch Code : "+this.branch_code);
		System.out.println("Admission fee :"+this.ad_fee);
		System.out.println("Tution Fee : "+this.tution_fee);
		System.out.println("Miscellaneous Fee : "+this.misc_fee);
		
		this.total_fee=this.ad_fee+this.tution_fee+this.misc_fee;
		System.out.println("Total fee : "+this.total_fee);
		System.out.println("Thank You");

	}
	
	
	
public static void main(String[] args) {
	int i=0,a=0;
	String name = null,address = null,phone_no = null,email = null,branch = null;

	Scanner s = new Scanner(System.in);
	System.out.println("welcome to student portal");
	program1 p1 = new program1();
	
	
	while(i==0){
		System.out.println("");
		System.out.println("");
		System.out.println("______________________________________________________________");

		System.out.println("1.Enter the Details: ");
		System.out.println("2.Diplay the Details: ");
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
			
			break;
		case 2:
			p1.disp(name,address,phone_no,email,branch);
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
