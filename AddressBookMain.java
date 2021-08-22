package address;
import java.util.*;		//scanner class
public class AddressBookMain {

	public static  int n=0,counter=0;
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
	//method to display the addressbook
	public void display()
	{
		System.out.println("first Name:"+first_name);
		System.out.println("last name:"+last_name);
		System.out.println("address:"+address);
		System.out.println("city:"+city);
		System.out.println("state:"+state);
		System.out.println("zip:"+zip);
		System.out.println("phone number:"+phone_number);
		System.out.println("E-mail:"+email);
	}
	//method to edit the addressbook
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
	//method to delete a contact in addressbook
	public static void delete(int c,AddressBookMain[] contact)
	{
		int i;
		if(c==n-1)
		{
			contact[c]=null;
		}
		else
		{
			for(i=c;i<n-1;i++)
			{
				contact[i]=contact[i+1];
			}
			contact[i]=null;   //to delete the object
			 System.gc();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to adress book program"); //welcome message
		
		Scanner sc=new Scanner(System.in);
		
		AddressBookMain[] contact=new AddressBookMain[10];  //array to store different contacts in address book
		
		
		
		System.out.println("Enter the details of person!!");
		
		String fname,lname,address,city,state,zip,pno,email;
		
		while(counter!=1) //it repeats till the user wants
		{
			System.out.println("Enter your choice\n1.add contact\n2.edit contact\n3.Delete contact\n4.Display contact\n5.Display addressbook\n6.exit"); //options for different actions
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:														//add a new address
			
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
				contact[n]=new AddressBookMain(fname,lname,address,city,state,zip,pno,email);	//object creation
				n++;
				break;
			
			case 2:System.out.println("Enter the person whose contact to be edited");	//to edit existing address
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
							contact[c1].edit(fname,lname,address,city,state,zip,pno,email);  //call the edit method
						}
					}
					break;
				   
			case 3: System.out.println("Enter the person whose contact to be deleted"); //to delete the contact of desired person
					String name11=sc.next();//input is taken from console
					for (int j=0;j<n;j++)
					{	
						if(contact[j].first_name.equals(name11))
						{
							int c1=j;
							delete(c1,contact);
							n=n-1;
						}
					}
					break;
						
			case 4: System.out.println("Enter the person whose contact to be displayed"); //to display desired contact
					String name1=sc.next();	//input is taken from console
					for (int j=0;j<n;j++)
					{
						if(contact[j].first_name.equals(name1))
						{
							int c1=j;
							contact[c1].display();	//call display function
						}
					  
					  
					}
				
					break;
					
			case 5:if(n==0)	//to display all the contacts of the address book
					{
						System.out.println("No Contacts in the address book!!!");
					}
					System.out.println("Address book contains following contacts!!!");
					for(int j=0;j<n;j++)
					{
						System.out.println("Contact details of person"+j);
						contact[j].display();
					}
					break;
			case 6: counter=1;			//to exit from the while loop
					break;
			}
			
			
		}
		
	}
	

}
