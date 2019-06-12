package backend;

import frontend.Product;
import frontend.User;
import util.Pair;

import java.util.List;

public class EstadisticaPorBarrio implements CalculadoraEstadistica {

    private String barrio;

    public EstadisticaPorBarrio(String barrio){
        this.barrio=barrio;
    }
    /*  Implementacion de metricas por kilo
        recorre cada usuario
        si el usuario persenese al barrio
        suma los productos por su peso a el resultado
    */

    @Override
    public double calcularKilosAcumulado(Municipio municipio) {

        List<Pair<User, Pair<Product, Integer>>> aux = municipio.getAcopioAcumulado();
        double result = 0;
        for(Pair<User, Pair<Product, Integer>> pair : aux){
            if(pair.getFirst().getBarrio().equals(barrio)){
                result += pair.getSecond().getFirst().getPeso() * pair.getSecond().getSecond();
            }
        }
        return Math.round(result * 1000)/1000.0;
    }
    /* Implementacion de metricas por volumen
       recorre cada usuario
       si el usuario persenese al barrio
       suma los productos por su peso a el resultado
    */
    @Override
    public double calcularVolumenAcumulado(Municipio municipio) {
        List<Pair<User, Pair<Product, Integer>>> aux = municipio.getAcopioAcumulado();
        double result = 0;
        for(Pair<User, Pair<Product, Integer>> pair : aux){
            if(pair.getFirst().getBarrio().equals(barrio)){
                result += pair.getSecond().getFirst().getVolumen() * pair.getSecond().getSecond();
            }
        }
        return Math.round(result * 1000)/1000.0;
    }
}
