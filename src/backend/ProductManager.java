package backend;

import frontend.Product;
import java.util.HashMap;

public class ProductManager{
	
	private HashMap<String, Product> productos;
    static ProductManager instance;
	
    private ProductManager() {
        this.productos = new HashMap<String, Product>();
    }

    /*  Esta clase permite el manejo de productos,cada producto es unico
        Por lo cual no se permite mas de una instancia del mismo.
        Permite validar la existencia de un producto , eliminarlo y devolverlo.
    */
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
        return productos.containsKey(codigodebarra);
    }    
    
    public Product getProducto(String codigodebarra) {
        return productos.get(codigodebarra);
    }

}