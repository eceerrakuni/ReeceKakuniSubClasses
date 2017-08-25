
public class NewCar extends Car {
	
	private String color;
	public NewCar(double cost, String color) {
		super(cost);
		this.color = color;
		
	}
	public void display() {
		System.out.println("price =  $" + getPrice() + " color = " + color);
		
	} 
	
	public boolean equals(NewCar newCar1) {
		boolean b = true;
		if (this.color.equals(newCar1.color)) {
			if (this.getPrice() == newCar1.getPrice()) {
				return true;
			} else {
				return false;
			}
		} 
		return b;
	}
	
}
