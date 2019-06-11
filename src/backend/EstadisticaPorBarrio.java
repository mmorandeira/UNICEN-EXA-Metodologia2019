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

    @Override
    public double calcularKilosAcumulado(Municipio municipio) {
        List<Pair<User, Pair<Product, Integer>>> aux = municipio.getAcopioAcumulado();
        double result = 0;
        for(Pair<User, Pair<Product, Integer>> pair : aux){
            if(pair.getFirst().getBarrio().equals(barrio)){
                result += pair.getSecond().getFirst().getPeso() * pair.getSecond().getSecond();
            }
        }
        return result;
    }

    @Override
    public double calcularVolumenAcumulado(Municipio municipio) {
        List<Pair<User, Pair<Product, Integer>>> aux = municipio.getAcopioAcumulado();
        double result = 0;
        for(Pair<User, Pair<Product, Integer>> pair : aux){
            if(pair.getFirst().getBarrio().equals(barrio)){
                result += pair.getSecond().getFirst().getVolumen() * pair.getSecond().getSecond();
            }
        }
        return result;
    }
}
