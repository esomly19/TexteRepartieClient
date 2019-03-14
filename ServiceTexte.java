import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface ServiceTexte  extends Remote{
	public void enregistrerNoeud(ServiceDistributeur st) throws RemoteException;
	public ArrayList<Phrases> envoyerTexte(ArrayList<Phrases> txt, String mot) throws RemoteException;
}
