import java.util.*;

public class AddressBook {
	
	
	
	private BuddyInfo b;

	private static ArrayList<BuddyInfo> buddyInfo = new ArrayList();
	
	
	public void addBuddy(BuddyInfo abuddyInfo) {
		
		if(buddyInfo != null) {
			buddyInfo.add(abuddyInfo);
		}
	
		
	}
	
	public void removeBuddy(int index) {
		
		if(index >= 0 &&  index < buddyInfo.size()) {
			
			buddyInfo.remove(index);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Address Book");
		
	
	}
}
