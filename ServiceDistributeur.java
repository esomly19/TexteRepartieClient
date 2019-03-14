import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface ServiceDistributeur extends Remote {

	public ArrayList<Phrases> traiterTexte(ArrayList<Phrases> travail, String mot) throws RemoteException;

}
