/**
 * 
 */

/**
 * @author nenem
 *
 */
import java.rmi.*;

import java.rmi.*;
public interface Communicate extends Remote {

	public boolean join(String ip,int port) throws RemoteException;
	
	public boolean leave (String ip, int port) throws RemoteException;
	
	public boolean subscribe (String ip, int port, String article) throws RemoteException;

	public boolean unsubscribe (String ip, int port, String article) throws RemoteException;
	
	public boolean publish (String ip, int port, String article) throws RemoteException;
	
	public boolean ping () throws RemoteException;

}
