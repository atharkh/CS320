import java.util.ArrayList;
public class Library {
	public String name;
	public int phoneNumber;
	public ArrayList<Book> collection; 
	
	public Library(String n, int pn) {
		name = n;
		phoneNumber = pn;
		collection = new ArrayList<Book>();
	}
	
	public String getName() {
		return name;
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(int pn) {
		phoneNumber = pn;
	}
	
	public void addBook(Book book) {
		collection.add(book);
	}
	
	public boolean contains(String title) {
		for(int i=0; i < collection.size(); i++) {
			Book book = collection.get(i);
			if(book.getTitle().equals(title)) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		String result = name +"'s collection:\n";
		for(int i=0; i < collection.size(); i++) {
			result += collection.get(i).toString();
			result += "\n";
		}
		return result;
	}
}
