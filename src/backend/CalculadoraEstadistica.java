package backend;

public interface CalculadoraEstadistica {
    //Interface de metricas que se calculan en la estadistica.
    double calcularKilosAcumulado(Municipio municipio);
    double calcularVolumenAcumulado(Municipio municipio);
}
