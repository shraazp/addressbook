package address;

import java.util.*; //import java utility class


public class MultipleAddressBook {  //different address book
	public static  int counter=0;		//to iterate the program many times
	public static Scanner sc=new Scanner(System.in);
	public static  void choice(int choice,AddressBookMain object)     //to perform different operations on contacts
	{
													//users choice is taken as input
			switch(choice)
			{
			case 1:	object.insertContact();			//add a new contact into addressbook
					break;
			
			case 2:object.edit();					//edit existing contact							
					break;
				   
			case 3: object.delete();				//delete the preferred contact
					break;
						
			case 4: object.display();				//display desired contact
					break;
					
			case 5:object.display_addressbook();	//display whole addressbook
					break;	
			}
			
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Hashtable<String,AddressBookMain>  multipleAddressBook = new Hashtable<String, AddressBookMain>();  //dictionary for mapping different address book with key 
		AddressBookMain object=new AddressBookMain();					//first addressbook
		
		String n="";
		String k="AddressBook1";
		multipleAddressBook.put(k, object);							//put the first addressbook into dictionary
		
		while(counter!=1) //it repeats till the user wants to end
		{
			System.out.println("Enter your choice\n1.add contact\n2.edit contact\n3.Delete contact\n4.Display contact\n5.Display addressbook\n6.Create another address book\n7.exit"); //options for different actions
			int choice=sc.nextInt();
			if(choice==6)  //to create a new address book
			{
				System.out.println("Enter the name of the addressbook");
				n=sc.next();
				AddressBookMain object1=new AddressBookMain();  // a new addressbook object is created 
				multipleAddressBook.put(n, object1);
					
			}
			else if(choice==7)				//to exist from the program
				counter=1;
			else
			{
				System.out.println("Enter the addressbook where you want to insert or modify the  contact!!");
				n=sc.next();
				choice(choice,multipleAddressBook.get(n));   //to perform required operation on desired addressbook
			}
			
			
		}
	}

	
		
}


