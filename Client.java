import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class Client {
	public static void main(String[] args) throws RemoteException, NotBoundException, FileNotFoundException {
		Registry reg = LocateRegistry.getRegistry("localhost");

		ServiceTexte tt = (ServiceTexte) reg.lookup("Phrases");

		BufferedReader br =  new BufferedReader(new InputStreamReader(new FileInputStream(new File(args[0]))));
		
		
		String mot = args[1];

		ArrayList<Phrases> lpx = tt.envoyerTexte(Phrases.cTexte(br), mot);
		
		for(int i=0;i<lpx.size(); i++)
		{
			System.out.println(lpx.get(i).toString());
			System.out.println("Noeud:"+lpx.get(i) + " s'est connecter");
			
		}
}
}
