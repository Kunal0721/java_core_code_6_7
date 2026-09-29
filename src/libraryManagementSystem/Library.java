package libraryManagementSystem;

import java.util.Scanner;

public class Library {
	private String librarianName;
	private Books books[] = new Books[100];
	private int index = 0;
	private Scanner sc = new Scanner(System.in);

	public Library(String librarianName) {
		super();
		this.librarianName = librarianName;
	}

	public int displayChoice() {
		System.out.println("Enter 1 for add book");
		System.out.println("Enter 2 for remove book");
		System.out.println("Enter 3 for sort book based on price");
		System.out.println("Enter 4 for search book");
		System.out.println("Enter 5 for display book");
		System.out.println("Enter 6 for exit...");
		System.out.println("==========================================");
		return sc.nextInt();
	}

	public void run() {
		while (true) {
			int choice = displayChoice();
			switch (choice) {
			case 1:
				addBook();
				break;
			case 2:
				System.out.println("remove");
				break;
			case 3:
				System.out.println("sort");
				break;
			case 4:
				search();
				break;
			case 5:
				displayLibBooks();
				break;
			case 6:
				System.out.println("exit..");
				return;
			default:
				System.out.println("Invalid choice  !!");
				break;
			}
		}
	}

	public void addBook() {
		Books b = new Books();
		System.out.println("Enter book id : ");
		b.setId(sc.nextInt());
		System.out.println("Enter book Name : ");
		b.setName(sc.next());
		System.out.println("Enter Book Price : ");
		b.setPrice(sc.nextDouble());
		System.out.println("Enter Book Page : ");
		b.setPages(sc.nextInt());
		System.out.println("Enter Book Author Name : ");
		b.setAuthorName(sc.next());
		books[index++] = b;
		System.out.println("Book added on index " + index + " successfully...");
		System.out.println("==================================================");
	}

	public void search() {
		System.out.println("Enter book name you want to search..");
		String bookName = sc.next();
		for (int i = 0; i < index; i++) {
			if (books[i].getName().toLowerCase().contains(bookName.toLowerCase())) {
				System.out.println("================================");
				System.out.println("Book Found : ");
				books[i].display();
			}
		}
	}

	public void displayLibBooks() {
		for (int i = 0; i < index; i++) {
			books[i].display();
		}
		System.out.println();
	}

	public int getBookSize() {
		return index;
	}

	public String getLibrarianName() {
		return librarianName;
	}

	public void setLibrarianName(String librarianName) {
		this.librarianName = librarianName;
	}

	public Books[] getBooks() {
		return books;
	}

	public void setBooks(Books[] books) {
		this.books = books;
	}

}
