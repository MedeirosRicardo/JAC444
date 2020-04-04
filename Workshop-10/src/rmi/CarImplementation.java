package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/** This class implements the generation function */
public class CarImplementation extends UnicastRemoteObject implements CarInterface {
	
	public CarImplementation() throws RemoteException {
		super();
	}
	
	/**
	 * Generate the new plate
	 * @return A string representing the new registered plate.
	 */
	@Override
	public String registerCar(Car car) throws RemoteException {
		return " " + car.hashCode();
	}

}
