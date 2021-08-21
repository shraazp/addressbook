package address;
import java.util.*;
public class AddressBookMain {

	//class members
	private String first_name;
	private String last_name;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phone_number;
	private String email;
	
	//parameterized constructors for initializing class members
	public AddressBookMain(String first_name,String last_name,String address,String city,String state,String zip,String phone_number,String email)
	{
		this.first_name=first_name;
		this.last_name=last_name;
		this.address=address;
		this.city=city;
		this.state=state;
		this.zip=zip;
		this.phone_number=phone_number;
		this.email=email;
	}
	
	public void display()
	{
		System.out.println("first Name:"+first_name);
		System.out.println("last name:"+last_name);
		System.out.println("address:"+address);
		System.out.println("city:"+city);
		System.out.println("state:"+state);
		System.out.println("zip:"+zip);
		System.out.println("phone number"+phone_number);
		System.out.println("E-mail:"+email);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to adress book program"); //welcome message
		
		Scanner sc=new Scanner(System.in);
		
		AddressBookMain[] contact=new AddressBookMain[10];  //array to store different contacts in address book
		System.out.println("How many contacts do you wanna add!!!");
		int n=sc.nextInt();
		System.out.println("Enter the details of person!!");
		String fname,lname,address,city,state,zip,pno,email;
		
		for(int i=0;i<n;i++) //for loop to add n people
		{
			System.out.println("first Name:");
			fname=sc.next();
			System.out.println("last name:");
			lname=sc.next();
			System.out.println("address:");
			address=sc.next();
			System.out.println("city:");
			city=sc.next();
			System.out.println("state:");
			state=sc.next();
			System.out.println("zip:");
			zip=sc.next();
			System.out.println("phone number");
			pno=sc.next();
			System.out.println("E-mail:");
			email=sc.next();
			contact[i]=new AddressBookMain(fname,lname,address,city,state,zip,pno,email);	//object creation
			
		}
		System.out.println("Details of the addressbook!!!1");
		for(int i=0;i<n;i++)
		{
			System.out.println("Details of "+i+" person!!!");
			contact[i].display(); //display the address book
			
		}
		
	}

}
