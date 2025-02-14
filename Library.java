package assignment;

public class Library {
	
	public String addBook(String bookTitle)
	{
		
		return "bookTitle";
	}
	
	public void issueBook() {
		System.out.println("Book Issued Successfully");
	}
	

	public static void main(String[] args) {
		Library Operation= new Library();
		System.out.println("Book added Successfully");
		System.out.println(Operation.addBook(null));
		Operation.issueBook();
	}

}
