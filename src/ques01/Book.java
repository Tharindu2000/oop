package ques01;

public class Book extends Item {
	private String publisher;
	private String category;
	private int pages;
	/**
	 * @param itemNo
	 * @param description
	 * @param unitPrice
	 * @param publisher
	 * @param category
	 * @param pages
	 */
	public Book(int itemNo, String description, double unitPrice, String publisher, String category, int pages) {
		super(itemNo, description, unitPrice);
		this.publisher = publisher;
		this.category = category;
		this.pages = pages;
	}
	@Override
	public void Display() {
		super.Display();
		System.out.println(this.publisher);
		System.out.println(this.category);
		System.out.println(this.pages);
	}
	
	
	
	
	
	

}
