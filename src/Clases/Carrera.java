package Clases;

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
        // Comprobamos si hay participantes
        if (getParticipantes().isEmpty()) {
            System.out.println("No hay participantes en la carrera.");
            return new ArrayList<>();
        }

        Participante ganador = getParticipantes().get(0);
        for (Participante participante : getParticipantes()) {
            ParticipanteCarrera participanteCarrera = (ParticipanteCarrera) participante;
            if (participanteCarrera.getTiempo() < ((ParticipanteCarrera) ganador).getTiempo()) {
                ganador = participante;
            }
        }

        ArrayList<Participante> ganadores = new ArrayList<>();
        ganadores.add(ganador);
        return ganadores;
    }

}

