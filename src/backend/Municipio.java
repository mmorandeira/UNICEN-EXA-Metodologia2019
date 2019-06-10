package backend;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import util.Pair;
import frontend.Product;
import frontend.User;

public class Municipio {
	ProductManager p;
	private List<PuntoItinerante> puntoItinerantes;
	private List<String> ong;
	private List<Pair <String, Date>> cronograma;
	private List<Pair <User,Pair<Product,Integer>>> acopioAcumulado;

	private Municipio(){
		p = ProductManager.getInstance();
		puntoItinerantes = new ArrayList<PuntoItinerante>();
		ong = new ArrayList<String>();
		cronograma = new ArrayList<>();
		acopioAcumulado = new ArrayList<>();
	}

	public void  addONG(String ong) {
		this.ong.add(ong);
	}
	
	public void addPuntoItinerante (PuntoItinerante p) {
		//verificarSiExistePunto
		this.puntoItinerantes.add(p);
	}

	public void addCronograma(Pair<String, Date> c) {
		this.cronograma.add(c);
	}
	
	public String getEstadisticas() {
		return "Estadistica";
	}

	
}
