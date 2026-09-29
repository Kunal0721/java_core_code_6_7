package libraryManagementSystem;

public class Books {
	private int id;
	private String name;
	private double price;
	private int pages;
	private String authorName;

	public void display() {
		System.out.println("Book : ");
		System.out.println("\tId : " + id);
		System.out.println("\tName : " + name);
		System.out.println("\tPrice : " + price);
		System.out.println("\tPages : " + pages);
		System.out.println("\tAuthor Name : " + authorName);
		System.out.println("=======================================");
	}

	public Books(int id, String name, double price, int pages, String authorName) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.pages = pages;
		this.authorName = authorName;
	}

	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

}
