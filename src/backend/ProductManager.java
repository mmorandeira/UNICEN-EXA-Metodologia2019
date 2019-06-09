package backend;

import java.util.hashMap;

Public class ProductManager{
	
	private HashMap<String, Product> productos;
    static ProductManager instance;
	
    private ProductManager() {
        this.productos = new HashMap<String, Product>();
    }
	
    public static ProductManager getInstance() {
        if (instance == null)
            instance = new ProductManager();
        return instance;
    }

    public void addProduct(Product producto) {
        productos.put(producto.getCodigoDeBarra(), producto);
    }
 
    public void deleteProduct(String codigodebarra) {
    	this.productos.remove(codigodebarra);
    }
    
    public boolean existeProducto(String codigodebarra) {
        return productos.conteinskey(codigodebarra);
    }    
    
    public Product getProducto(String codigodebarra) {
        return productos.get(codigodebarra);
    }       
    
}