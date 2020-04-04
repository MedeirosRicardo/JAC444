package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/** This class creates a registration interface */
public interface CarInterface extends Remote {
	public String registerCar(Car car) throws RemoteException;
}
