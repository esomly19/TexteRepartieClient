import java.io.BufferedReader;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.ArrayList;

public class Phrases implements Serializable {

	private String phr;

	ServiceDistributeur sd;

	public Phrases() {

	}

	public Phrases(String string) {
		this.phr = string;
	}

	public static ArrayList<Phrases> cTexte(BufferedReader br) {
		String ligne;
		Phrases phr;
		ArrayList<Phrases> res = new ArrayList<Phrases>();
		try {
			while ((ligne = br.readLine()) != null) {
				phr = new Phrases(ligne);
				res.add(phr);
			}
			br.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return res;
	}

	public void setProxy(ServiceDistributeur sids) {
		sd = sids;
	}

	@Override
	public String toString() {
		return "Phrases [phrases=" + phr + "]";
	}

	public String getPhr() {
		return this.phr;
	}

}
