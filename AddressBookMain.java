package address;
import java.util.*;
public class AddressBookMain {

	
	//class members
	public String first_name;
	public String last_name;
	public String address;
	public String city;
	public String state;
	public String zip;
	public String phone_number;
	public String email;
	
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
	
	public void edit(String first_name,String last_name,String address,String city,String state,String zip,String phone_number,String email)
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
	public static void delete(int c,AddressBookMain[] contact)
	{
		int i;
		for(i=c;i<contact.length-1;i++)
		{
			contact[i]=contact[i+1];
		}
		contact[i]=null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to adress book program"); //welcome message
		
		Scanner sc=new Scanner(System.in);
		
		AddressBookMain[] contact=new AddressBookMain[10];  //array to store different contacts in address book
		
		int n=0,counter=0;
		
		System.out.println("Enter the details of person!!");
		
		String fname,lname,address,city,state,zip,pno,email;
		
		while(counter!=1)
		{
			System.out.println("Enter your choice\n1.add contact\n2.edit contact\n3.Display contact\n4.exit");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			
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
				contact[n]=new AddressBookMain(fname,lname,address,city,state,zip,pno,email);	//object creation
				n++;
				break;
			
			case 2:System.out.println("Enter the person whose contact to be edited");	
				String name=sc.next();
					for (int j=0;j<n;j++)
					{
						if(contact[j].first_name.equals(name))
						{
							int c1=j;
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
							System.out.println("phone number:");
							pno=sc.next();
							System.out.println("E-mail:");
							email=sc.next();
							contact[c1].edit(fname,lname,address,city,state,zip,pno,email);
						}
					}
					break;
				   
			
						
			case 3: System.out.println("Enter the person whose contact to be displayed");
					String name11=sc.next();
					for (int j=0;j<n;j++)
					{
						if(contact[j].first_name.equals(name11))
						{
							int c1=j;
							contact[c1].display();
						}
					   
					}
				
					break;
			case 4: counter=1;
					break;
			}
			
			
		}
		
	}
	

}
