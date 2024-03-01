package Clases;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.spi.LocaleServiceProvider;

public class Carrera extends EventoDeportivo{

    //ATRIBUTOS DE CLASE
    private double distancia;

    //CONSTRUCTOR DE CLASE
    public Carrera(String nombre, LocalDateTime fecha, String lugar, ArrayList<Participante> participantes, double distancia) {
        super(nombre, fecha, lugar, participantes);
        this.distancia = distancia;
    }

    //METODOS DE CLASE


    @Override
    public ArrayList<Participante> obtenerGanador() {
        return super.obtenerGanador();
    }
}
