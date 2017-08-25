
public class UsedCar extends Car {
	
	private int mileage;
	public UsedCar(double cost, int mileage) {
		super(cost);
		this.mileage = mileage;
	}
	
	public void display() {
		System.out.println("price = " + getPrice() + " mileage = " + mileage);
	}
	
	public boolean equals(UsedCar usedCar1) {
		boolean b = true;
		if (this.mileage == usedCar1.mileage) {
			if (this.getPrice() == usedCar1.getPrice()) {
				return true;
			} else {
				return false;
			}
		} 
		return b;
	}

}
