import Clases.*;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Participante participanteCarrera1 = new Participante("13693837M","Paco","González Jiménez",20);
        ArrayList<Participante> participantesCarrera = new ArrayList<>();
        LocalDateTime fecha1 = LocalDateTime.now();
        ArrayList<Equipo> equipos = new ArrayList<>();

        participantesCarrera.add(0,participanteCarrera1);
        Carrera carrera1 = new Carrera("Carrera1",fecha1,"Pabellón Deportivo",participantesCarrera,2000);

        Participante participanteFutbol1 = new Participante("Z7622641D","Roberto","Calderón Losantos",25);
        ArrayList<Participante> participantesFutbol = new ArrayList<>();
        participantesFutbol.add(0,participanteFutbol1);
        TorneoDeFutbol torneo1 = new TorneoDeFutbol("Torneo1",fecha1,"Campo de Fútbol",participantesFutbol,);
        Equipo equipo1 = new Equipo("Equipo1", 20, participantesCarrera);

    }
}
