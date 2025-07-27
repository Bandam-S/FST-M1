package Activities;

public class Activity6 {


		    public static void main(String[] args) {
		        Plane plane = new Plane(10);
		       
		        plane.onboard("Sandeep");
		        plane.onboard("Steve");
		        plane.onboard("Kevin");
		      
		        System.out.println("Plane took off at: " + plane.takeOff());
		        System.out.println("People on the plane: " + plane.getPassengers());
		        System.out.println("Plane landed at: " + plane.landing());
		        System.out.println("People on the plane after landing: " + plane.getPassengers());
		    }

	}


