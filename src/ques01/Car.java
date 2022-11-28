package ques01;

public class Car extends Item {
	
	private String model;
	private String type;
	/**
	 * @param itemNo
	 * @param description
	 * @param unitPrice
	 * @param model
	 * @param type
	 */
	public Car(int itemNo, String description, double unitPrice, String model, String type) {
		super(itemNo, description, unitPrice);
		this.model = model;
		this.type = type;
	}
	@Override
	public void Display() {
		super.Display();
		System.out.println(this.model);
		System.out.println(this.type);
	}
	
	

}
