package backend;

import util.Pair;

import java.util.Vector;
    // Esta clase contiene un vector de cordenadas
public class Mapa {
    private  Vector<Pair<Integer,Integer>> mapa;
    private static Mapa instance;


    private Mapa (){
        this.mapa = new Vector<Pair<Integer,Integer>>();
    }

    public static Mapa getInstance(){
        if(instance == null){
            instance = new Mapa();
        }
        return instance;
    }

    public void mostrar(){

    }

}