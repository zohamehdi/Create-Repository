import java.util.*;

public class AddressBook {
	
	
	
	private BuddyInfo b;

	private static ArrayList<String> NA = new ArrayList();
	private static ArrayList<String> Ad = new ArrayList();
	private static ArrayList<Integer> pn = new ArrayList();
	private static List<List> jj = new ArrayList();
	private static String name;
	private String address;
	private int Phone_Number;
	
	public void addBuddy(String name, String address, int Phone_Number) {
		
	 NA.add(name);   
	  Ad.add(address);
	  pn.add(Phone_Number);
	 jj.add(NA);
	 jj.add(Ad);
	 jj.add(pn);
		
	}
	
	public void removeBuddy(String name, String address, int Phone_Number) {
		
		jj.remove(name);
		jj.remove(address);
		jj.remove(Phone_Number);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressBook l = new AddressBook();
		l.addBuddy("lol", "uhh", 86877);
		//l.addBuddy("lala", "jhkjhk", 67555);
		
		for(List t: jj) {
			System.out.println(t);
		}
	}
}
