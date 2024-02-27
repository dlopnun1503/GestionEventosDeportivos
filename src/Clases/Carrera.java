package Clases;

import java.util.ArrayList;
import java.util.spi.LocaleServiceProvider;

public class Carrera extends EventoDeportivo{

    //ATRIBUTOS DE CLASE
    private double distancia;

    //CONSTRUCTOR DE CLASE
    public Carrera(String nombre, LocaleServiceProvider fecha, String lugar, ArrayList<Participante> participantes, double distancia) {
        super(nombre, fecha, lugar, participantes);
        this.distancia = distancia;
    }

    //METODOS DE CLASE

}
