package Activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
	private List<String> passengers;
	private int maxpassangers;
	private Date takeoff;
	private Date landing;

	public Plane(int maxpassangers) {
		this.maxpassangers=maxpassangers;
		this.passengers=new ArrayList<>();
	}
	public void onboard(String passengerName)
	{
	if(passengers.size()<=maxpassangers) 
	{
		this.passengers.add(passengerName);
	}
		else {
			System.out.println("Plane is full");
		}
		}
		
	 public Date takeOff() {
	        this.takeoff = new Date();
	        return takeoff;
	 }
	 public Date landing() {
	        this.landing = new Date();
	        return landing;
	    }

	    public List<String> getPassengers() {
	        return passengers;
	    }
}
