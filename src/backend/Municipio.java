package backend;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import etc.Pair;
import etc.Product;
import etc.PuntoItinerante;
import etc.User;

public class Municipio {
	ProductManager p;
	private List<PuntoItinerante> PuntosItinerantes;
	private List<String> ONG;
	private List<Pair <String, Date>> Cronograma;
	
	private List<Pair <User,Pair<Product,int>>> acopioAcumulado;
	

	public void  addONG(String ong) {
		this.ONG.add(ong);
	}
	
	public void addPuntoItinerante (PuntoItinerante p) {
		//verificarSiExistePunto
		this.PuntosItinerantes.add(p);
	}

	public void addCronograma(Pair<String, Date> c) {
		Cronograma.add(c);
	}
	
	public String getEstadisticas() {
		return "Estadistica";
	}


	
	/*public boolean existePunto(PuntoItinerante p) {
		for(int i=0; i< PuntosItinerantes.size(); i++)
			if((PuntosItinerantes.get(i))
				return true;
		return false;
	}*/
	
}
