package backend;

import java.util.List;

import frontend.Product;
import frontend.User;
import util.Pair;

public class EstadisticaPorMaterial implements CalculadoraEstadistica {
	private String material;
	 
	public EstadisticaPorMaterial(String material) {
		this.material = material;
	}
    @Override
    public double calcularKilosAcumulado(Municipio municipio) {
    	 List<Pair<User, Pair<Product, Integer>>> aux = municipio.getAcopioAcumulado();
         double result = 0;
         for(Pair<User, Pair<Product, Integer>> pair : aux){
             if(pair.getSecond().getFirst().getMaterial().equals(this.material)){
                 result += pair.getSecond().getFirst().getPeso() * pair.getSecond().getSecond();
             }
         }
         return Math.round(result * 1000)/1000.0;
     }
    @Override
    public double calcularVolumenAcumulado(Municipio municipio) {
    	List<Pair<User, Pair<Product, Integer>>> aux = municipio.getAcopioAcumulado();
    	double result = 0;
    	for(Pair<User, Pair<Product, Integer>> pair : aux){
    		if(pair.getSecond().getFirst().getMaterial().equals(this.material)){
    			result += pair.getSecond().getFirst().getVolumen() * pair.getSecond().getSecond();
    		}
    	}
    	return Math.round(result * 1000)/1000.0;
}
}
