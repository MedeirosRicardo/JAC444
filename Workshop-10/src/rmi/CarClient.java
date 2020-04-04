package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class CarClient {
	
	public static void main(String[] args) {
		try {
			
			Car car = new Car("BMW X6", "Red", 1000);
			System.out.println(car.toString());
						
			CarInterface obj = (CarInterface) Naming.lookup("rmi://localhost:5099/CreatePlate");
			car.setPlate(obj.registerCar(car));
						
			System.out.println("Car after plate registration");
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
