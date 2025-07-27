package Activities;

import java.util.Scanner;

public class Activitythreeplanets {

	public static void main(String[] args) {
		
try (Scanner S = new Scanner(System.in)) {
	System.out.println("enter the value of earthseconds");
	double earthseconds=S.nextDouble();
	
		double seconds=1000000000;
		double mercuryseconds=0.2408467;
		double venusseconds=0.61519726;
		double marsseconds=1.8808158;
		double JupiterSeconds = 11.862615;
		double SaturnSeconds = 29.447498;
		double UranusSeconds = 84.016846;
		double NeptuneSeconds = 164.79132;
		 System.out.println("Age on Mercury: " + seconds / earthseconds / mercuryseconds);
		 System.out.println("Age on Venus: " + seconds / earthseconds / venusseconds);
		 System.out.println("Age on Mars: " + seconds / earthseconds / marsseconds);
		 System.out.println("Age on Jupiter: " + seconds / earthseconds / JupiterSeconds);
		 System.out.println("Age on Saturn: " + seconds / earthseconds / SaturnSeconds);
		 System.out.println("Age on Uranus: " + seconds / earthseconds / UranusSeconds);
		 System.out.println("Age on Neptune: " + seconds / earthseconds / NeptuneSeconds);
}
	
	}

}
