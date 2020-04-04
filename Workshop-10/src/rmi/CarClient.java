package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/** A class that represent the car client */
public class CarClient {
	
	/**
	 * Creates a new car with undefined plate.
	 * Send this car to be registered in the server.
	 * Receives the registered car from the server.
	 */
	public static void main(String[] args) {
		try {
			
			System.out.println("NEW CAR CREATED");
			
			Car car = new Car("BMW X6", "Red", 1000);
			
			System.out.println(car.toString());
			System.out.println("\nRequesting new plate...");
						
			CarInterface obj = (CarInterface) Naming.lookup("rmi://localhost:5099/CreatePlate");
			car.setPlate(obj.registerCar(car));
						
			System.out.println("\nNew plate returned: " + car.getPlate());
			System.out.println("\nNEW CAR REGISTERED");
			System.out.println(car.toString());
			
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		} catch (RemoteException e) {
			System.out.println(e.getMessage());
		} catch (NotBoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
