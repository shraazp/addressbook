package address;

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
		AddressBookMain a1=new AddressBookMain("shravya","p","gummattegadade house","Bettampady","karnataka","xyz","7338221810","@gmail.com");	//object creation
		a1.display(); //display the address book
	}

}
