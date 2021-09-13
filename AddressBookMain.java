package address;
import java.util.*;		
/**
 * class containing different contacts
 * @author Shravya P
 */
public class AddressBookMain {
	public  ArrayList<AddressBookMain> contact=new ArrayList<>();  
	public  Scanner sc=new Scanner(System.in);
	public String first_name;
	public String last_name;
	public String address;
	public String city;
	public String state;
	public String zip;
	public String phone_number;
	public String email;
	/**
	 * default constructor to print welcome message
	 */
	public AddressBookMain()
	{
		System.out.println("Welcome to adress book program"); 
	}
	/**
	 * Parameterized constructor to initialize contact
	 * @param first_name first name of contact
	 * @param last_name last name of contact
	 * @param address address of the contact
	 * @param city city of the contact
	 * @param state state of the contact
	 * @param zipzip of the contact
	 * @param phone_number phone number of the contact
	 * @param email email of the contact
	 */
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
	/**
	 * method to insert a new contact into addressbook
	 */
	public void  insertContact()
	{
		System.out.println("Enter the details of person!!");
		System.out.println("first Name:");
		String first_name=sc.next();
		if(duplicateCheck(first_name)==false)
		{
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
	}
	/**
	 * method to display a particular contact
	 */
	public void display()
	{
		System.out.println("Enter the person whose contact to be displayed"); //to display desired contact
		String name1=sc.next();	//input is taken from console
		int flag=0;
		for (int j=0;j<contact.size();j++)
		{
			AddressBookMain object=contact.get(j);
			if(object.first_name.equals(name1))
			{
			    flag=1;
				System.out.println("first Name:"+object.first_name);
				System.out.println("last name:"+object.last_name);
				System.out.println("address:"+object.address);
				System.out.println("city:"+object.city);
				System.out.println("state:"+object.state);
				System.out.println("zip:"+object.zip);
				System.out.println("phone number:"+object.phone_number);
				System.out.println("E-mail:"+object.email);	
			} 
		}	
		if(flag==0)
		    System.out.println("Contact not found!!!");
	}
	/**
	 * method to display the entire addressbook
	 */
	public void display_addressbook()
	{
		if(contact.size()==0)	
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
				System.out.println("E-mail:"+object.email);	
			}
		}
	}
	/**
	 * method to edit the contact of addressbook
	 */
	public void edit()
	{
		System.out.println("Enter the person whose contact to be edited");	
		String name=sc.next();
		int flag=0;
		for (int j=0;j<contact.size();j++)
		{
		    AddressBookMain object=contact.get(j);
			if(object.first_name.equals(name))
			{
			    flag=1;
				System.out.println("first Name:"+object.first_name);
				System.out.println("last name:"+object.last_name);
				System.out.println("address:"+object.address);
				System.out.println("city:"+object.city);
				System.out.println("state:"+object.state);
				System.out.println("zip:"+object.zip);
				System.out.println("phone number:"+object.phone_number);
				System.out.println("E-mail:"+object.email);	
				System.out.println("Enter the number which you want to edit\n1.first name\n2.last name\n3.address\n4.city\n5.state\n6.zip\n7.phone number\n8.email");
                int choose = sc.nextInt();
                switch(choose){
                    case 1: System.out.println("first name:");
                        object.first_name=sc.next();
                        break;
                    case 2: System.out.println("last name:");
                        object.last_name=sc.next();
                        break;
                    case 3: System.out.println("address:");
                        object.address=sc.next();
                        break;
                    
                    case 4: System.out.println("city:");
                        object.city=sc.next();
                        break;
                    case 5: System.out.println("state:");
                        object.state=sc.next();
                        break;
                    case 6: System.out.println("zip:");
                        object.zip=sc.next();
                        break;
                    case 7: System.out.println("phone_number:");
                        object.phone_number=sc.next();
                        break;
                    case 8: System.out.println("email:");
                        object.email=sc.next();
                        break;
                }
			}
		}	
		if(flag==0)
            System.out.println("Contact not found!!!");
	}
	/**
	 * method to delete a contact in a addressbook
	 */
	public void delete()
	{
		System.out.println("Enter the person whose contact to be deleted"); 
		String name11=sc.next();
		int flag=0;
		for (int j=0;j<contact.size();j++)
		{	
			AddressBookMain object=contact.get(j);
			if(object.first_name.equals(name11))
			{
			    flag=1;
				contact.remove(object);	
			}
		}
		if(flag==0)
            System.out.println("Contact not found!!!");
	}
	/**
	 * method to check if contact is already present in addressbook
	 * @param name first name of the contact to be inserted
	 * @return true if it exists or else false
	 */
	public Boolean duplicateCheck(String name)
	{
	    for (int j=0;j<contact.size();j++)
        {   
            AddressBookMain object=contact.get(j);
            if(object.first_name.equals(name))
            {
                System.out.println("Contact already exists!!Please enter a different contact name"); 
                return true;
            }
        }
	    return false;
	}
	/*
	 * method to search a particular contact based on city or state
	 */
    public void search(String place) {
        for (int j=0;j<contact.size();j++)
        {   
            AddressBookMain object=contact.get(j);
            if(object.city.equals(place)||object.state.equals(place))
            {
                System.out.println(object.first_name+" "+object.last_name);  
            }
        }
        
    }
}