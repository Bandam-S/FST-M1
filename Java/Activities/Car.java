package Activities;

public class Car {
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	public Car(String color, String tranmission, int make, int tyres, int doors) {
	this.color=color;
	this.transmission=tranmission;
	this.make=make;
	this.tyres=tyres;
	this.doors=doors;
	}
	
		public void displayCharacterstics() {
			System.out.println("Color of the car "+ color);
			System.out.println("transmission of the car "+transmission);
			System.out.println("no of doors "+doors);
			System.out.println("no of tyres "+tyres);
			
		}
		
		public void accelerate() {
			System.out.println("Car is moving");
		}
		
		public void brake() {
			System.out.println("car is stopped");
		}
	}

