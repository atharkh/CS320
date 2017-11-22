
public class Book {
	private String title;
	private String isbn;
	private int numPages;
	private boolean onLoan;
	
	public Book(String t, String bn, int np){
		title = t;
		isbn = bn;
		numPages = np;
		onLoan = false;
	}
	
	public boolean IsonLoan(){
		return onLoan;
	}

	public void SetOnloan(boolean loan){
		onLoan = loan;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getIsbn(){
		return isbn;
	}
	
	public int getNumpages(){
		return numPages;
	}
	
	public String toString(){
		return title + ":" +
			   isbn + "," +
			   numPages + " pages" +
			   " onLoan" + "=" + onLoan ;
		
	}
}


