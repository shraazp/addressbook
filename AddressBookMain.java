package address;
import java.util.*;		//scanner class
public class AddressBookMain {

	public  ArrayList<AddressBookMain> contact=new ArrayList<>();  //collection class array list is used to store different contacts in address book
	public  Scanner sc=new Scanner(System.in);
											//counter variable to repeat while loop to add more contacts
	/*class members
	 * all the details of contacts
	 */
	public String first_name;
	public String last_name;
	public String address;
	public String city;
	public String state;
	public String zip;
	public String phone_number;
	public String email;
	
	public AddressBookMain()
	{
		System.out.println("Welcome to adress book program"); //welcome message
	}
	
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
	
	//parameterized constructors for initializing class members
	public void  insertContact()
	{
		System.out.println("Enter the details of person!!");
		System.out.println("first Name:");
		String first_name=sc.next();
		System.out.println("last name:");
		String last_name=sc.next();
		System.out.println("address:");
		String address=sc.next();
		System.out.println("city:");
		String city=sc.next();
		System.out.println("state:");
		String state=sc.next();
		System.out.println("zip:");
		String zip=sc.next();
		System.out.println("phone number:");
		String phone_number=sc.next();
		System.out.println("E-mail:");
		String email=sc.next();
		contact.add(new AddressBookMain(first_name,last_name,address,city,state,zip,phone_number,email));
		
	}
	//method to display the addressbook
	public void display()
	{
		System.out.println("Enter the person whose contact to be displayed"); //to display desired contact
		String name1=sc.next();	//input is taken from console
		for (int j=0;j<contact.size();j++)
		{
			AddressBookMain object=contact.get(j);
			if(object.first_name.equals(name1))
			{
				
				System.out.println("first Name:"+first_name);
				System.out.println("last name:"+last_name);
				System.out.println("address:"+address);
				System.out.println("city:"+city);
				System.out.println("state:"+state);
				System.out.println("zip:"+zip);
				System.out.println("phone number:"+phone_number);
				System.out.println("E-mail:"+email);	//call display function
			}
		  
		  
		}
		
	}
	
	public void display_addressbook()
	{
		if(contact.size()==0)	//to display all the contacts of the address book
		{
			System.out.println("No Contacts in the address book!!!");
		}
		else
			{
			System.out.println("Address book contains following contacts!!!");
			
			for(int j=0;j<contact.size();j++)
			{
				AddressBookMain object=contact.get(j);
				System.out.println("Contact details of person"+j);
				System.out.println("first Name:"+object.first_name);
				System.out.println("last name:"+object.last_name);
				System.out.println("address:"+object.address);
				System.out.println("city:"+object.city);
				System.out.println("state:"+object.state);
				System.out.println("zip:"+object.zip);
				System.out.println("phone number:"+object.phone_number);
				System.out.println("E-mail:"+object.email);	//call display function
			}
		}
	}
	//method to edit the address book object itself modified
	public void edit()
	{
		System.out.println("Enter the person whose contact to be edited");	//to edit existing address
		String name=sc.next();
			for (int j=0;j<contact.size();j++)
			{
				AddressBookMain object=contact.get(j);
				if(object.first_name.equals(name))
				{
					
					System.out.println("first Name:");
					this.first_name=sc.next();
					System.out.println("last name:");
					this.last_name=sc.next();
					System.out.println("address:");
					this.address=sc.next();
					System.out.println("city:");
					this.city=sc.next();
					System.out.println("state:");
					this.state=sc.next();
					System.out.println("zip:");
					this.zip=sc.next();
					System.out.println("phone number:");
					this.phone_number=sc.next();
					System.out.println("E-mail:");
					this.email=sc.next();
					
				}
			}
		
	}
	//method to delete a contact in address book
	public  void delete()
	{
		System.out.println("Enter the person whose contact to be deleted"); //to delete the contact of desired person
		String name11=sc.next();//input is taken from console
		
		for (int j=0;j<contact.size();j++)
		{	
			AddressBookMain object=contact.get(j);
			if(object.first_name.equals(name11))
			{
				
				contact.remove(object);	//array list has built in method to remove objects
			
			}
		}
								
		
	}
	
	
	

}