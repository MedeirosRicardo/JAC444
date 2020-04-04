package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CarServer {
	
	public CarServer() {
		try {
			
			CarInterface obj = new CarImplementation();
			
			Registry registry = LocateRegistry.createRegistry(5099);
			registry.rebind("CreatePlate", obj);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		new CarServer();
		System.out.println("CreatePlate is running");
	}
}
