package address;
import java.util.*; 
/**
 * class contains multiple address books
 * each addressbook has different contacts
 * @author Shravya P
 */
public class MultipleAddressBook {  
	static int counter=0;		
	static Scanner sc=new Scanner(System.in);
	/**
	 * method to call different operations on addressbook
	 * @param choice which operation
	 * @param object addressbook where operations are performed
	 */
	public static  void choice(int choice,AddressBookMain object)     
	{											
			switch(choice)
			{
			case 1:	object.insertContact();			
					break;
			
			case 2:object.edit();										
					break;
				   
			case 3: object.delete();				
					break;
						
			case 4: object.display();				
					break;
					
			case 5:object.display_addressbook();
					break;	
			default:System.out.println("Please enter a valid number");
			break;
			}		
	}
	public static void main(String[] args) {
		Map<String,AddressBookMain>  multipleAddressBook = new HashMap<>();   
		AddressBookMain object=new AddressBookMain();					
		String n="";
		String k="AddressBook1";
		multipleAddressBook.put(k, object);						
		while(counter!=1) 
		{
			System.out.println("Enter your choice\n1.add contact\n2.edit contact\n3.Delete contact\n4.Display contact\n5.Display addressbook\n6.Create another address book\n7.Display address books\n8.Search for city or state\n9.view by state or city\n9.View persons by state\n10.View persons by city\n11.Sort by name\n12.exit"); 
			int choice=sc.nextInt();
			if(choice==6)  
			{
				System.out.println("Enter the name of the addressbook");
				n=sc.next();
				if(multipleAddressBook.containsKey(n))
				{
				    System.out.println("Address book already exists!!!Please enter again");
				    n=sc.next();
				}
				AddressBookMain object1=new AddressBookMain();  
				multipleAddressBook.put(n, object1);
					
			}
			else if(choice==7)
			{
			    for(Map.Entry<String, AddressBookMain> entry : multipleAddressBook.entrySet())
			    {
			        System.out.println(entry.getKey());
			    }
			}
			else if(choice==8)
			{
			    System.out.println("Enter the name of city or state");
			    String place=sc.next();
			    System.out.println("Persons whose state or city is "+place);
			    for(Map.Entry<String, AddressBookMain> entry : multipleAddressBook.entrySet())
			    {
			        AddressBookMain object1=entry.getValue();
			        object1.search(place);
			    }
			      
			}
			else if(choice == 9)
            {
                for(Map.Entry<String, AddressBookMain> entry : multipleAddressBook.entrySet())
                {
                    AddressBookMain object1=entry.getValue();
                    System.out.println("Addressbook:"+entry.getKey());
                    object1.viewPersonByState();
                }

            }
            else if(choice == 10)
            {
                for(Map.Entry<String, AddressBookMain> entry : multipleAddressBook.entrySet())
                {
                    AddressBookMain object1=entry.getValue();
                    System.out.println("Addressbook:"+entry.getKey());
                    object1.viewPersonByCity();
                }
            }
            else if(choice == 11)
            {
                for(Map.Entry<String, AddressBookMain> entry : multipleAddressBook.entrySet())
                {
                    AddressBookMain object1 = entry.getValue();
                    System.out.println("Addressbook:"+entry.getKey());
                    object1.sortByName();
                }
            }
			else if(choice==12)				
				counter=1;
			else
			{
			    System.out.println("Enter the addressbook where you want to insert or modify the  contact!!");
				n=sc.next();
				try {
				    choice(choice,multipleAddressBook.get(n)); 
				}
				catch(Exception e)
				{
				    System.out.println("Please enter a valid addressbook!!!");
				}	 
			}	
		}
	}		
}


