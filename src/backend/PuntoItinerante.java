package backend;

public class PuntoItinerante {
    
	private int id;
	private String direccion;
	private boolean activo;
	//private Camion c;
	
	public PuntoItinerante(int id, String direccion, boolean activo){
		this.id = id; 
		this.direccion = direccion;
		this.activo = activo;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
    
	
	
}
