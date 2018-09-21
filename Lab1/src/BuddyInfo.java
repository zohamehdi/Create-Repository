/**
 * Lab 
 * Name: Zoha Mehdi
 * Student number: 101054547
 * Course and Section: 3110 L2 
 * 
 * 
 */

public class BuddyInfo {
	
	private static String name; //Name 
	private String address; //Address
	private String Phone_Number; //Phone_Number

	
	/**
	 * 
	 * @param name
	 * @param address
	 * @param Phone_Number
	 */
	public BuddyInfo(String name, String address, String Phone_Number) {
		this.name = name;  
		this.address = address;
		this.Phone_Number = Phone_Number;
	}

	/*
	 * Returns Name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * setName method sets the name
	 */
	public void setName(String name) {
		this.name = name;
	}
    
	/**
	 * 
	 * Returns Address 
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * SetAddress sets the address
	 *
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 
	 *  Returns phone number
	 */
	public String getPhone_Number() {
		return Phone_Number;
	}
	
	/*
	 * Sets the phone number
	 */
	public void setPhone_Number(String phone_Number) {
		Phone_Number = phone_Number;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BuddyInfo b = new BuddyInfo("Mac", "DownTown", "6789"); //Created Buddy object
		System.out.println( " Hello " + b.getName()); //Printing 'Hello' before buddies name.
		
		System.out.println("Hello world!"); //Printing hello world 
	}

}
