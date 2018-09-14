/**
 * Lab 2
 * Name: Zoha Mehdi
 * Student number: 101054547
 * Course and Section: 3110 L2 
 */


import java.util.*;

public class Addressbook {
	
	
	private static ArrayList<BuddyInfo> buddyInfo = new ArrayList(); // Creating an ArrayList of type BuddyInfo
	
	/*
	 * addBuddy method for adding buddies in the ArrayList
	 */
	public void addBuddy(BuddyInfo abuddyInfo) {
		
		if(buddyInfo != null) {        //If abuddyInfo is not null than add it to the ArrayList.
			buddyInfo.add(abuddyInfo);
		}
	
		
	}
	
	/*
	 * RemoveBuddy method is used for removing a buddy from the ArrayList
	 * using index.
	 */
	public void removeBuddy(int index) {
		
		if(index >= 0 &&  index < buddyInfo.size()) { //Execute if statement if index is greater than or equal to 0 and 
			                                          // less than the ArrayList size.
			buddyInfo.remove(index); //Remove buddy by index
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		BuddyInfo buddy = new BuddyInfo("Totine", "prince of world", "516"); //Creating a buddy object
		AddressBook addressBook = new AddressBook(); //Creating AddressBook object
		addressBook.addBuddy(buddy); //Adding buddy in the ArrayList
		addressBook.removeBuddy(0); //Removing buddy at index 0.
	
	}
}
