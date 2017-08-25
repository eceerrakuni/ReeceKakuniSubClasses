
public class Car {
	
	private double price;
	
	public Car(double cost) {
		price = cost * 2;
	}
	
	
	public double getPrice() {
		return price;
	}
	
		
	
	public static void main(String[] args) {
		NewCar new1 = new NewCar(8000.33, "silver");
		NewCar new2 = new NewCar(8000.33, "silver");
		if (new1.equals(new2)) {
			new1.display();
		}
		
		UsedCar used1 = new UsedCar(2500, 100000);
		UsedCar used2 = new UsedCar(2500, 100000);
		if (used1.equals(used2)) {
			used1.display();
			
		}
	}
	

}
