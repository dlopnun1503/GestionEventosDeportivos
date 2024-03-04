import Clases.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Equipo> equipos = new ArrayList<>();

        LocalDateTime fecha1 = LocalDateTime.of(2022,12,24,12,42,12);
        LocalDateTime fecha2 = LocalDateTime.of(2001,3,13,7,21,1);

        EventoDeportivo Carrera1 = new Carrera("Maraton", fecha1, "Ciudad X", new ArrayList<>(), 42.195);
        TorneoDeFutbol Torneo1 = new TorneoDeFutbol("Copa Mundial",fecha2,"Barcelona",new ArrayList<>(),new ArrayList<>());

        Participante participanteCarrera1 = new ParticipanteCarrera("05339171C","Juan","Toro Gimeno",17,223);
        Participante participanteCarrera2 = new ParticipanteCarrera("49467087K","Francisco","Beltran Mateu",21,181);
        Participante participanteCarrera3 = new ParticipanteCarrera("18734366S","Maria","Campos Padilla",19,204);
        Participante participanteCarrera4 = new ParticipanteCarrera("01013859L","Laura","Gomez Sierra",20,198);

        Participante participanteTorneo1 = new Participante("00898876J","Carlos","Serrano",24);
        Participante participanteTorneo2 = new Participante("42108698E","Manuel","Teruel",30);
        Participante participanteTorneo3 = new Participante("41249244D","Santiago","Cabeza",26);

        Equipo equipo1 = new Equipo("Equipo1",200,new ArrayList<>());
        Equipo equipo2 = new Equipo("Equipo2",150,new ArrayList<>());
        Equipo equipo3 = new Equipo("Equipo3",190,new ArrayList<>());


        Torneo1.inscribirEquipo(equipo1);
        Torneo1.inscribirEquipo(equipo2);
        Torneo1.inscribirEquipo(equipo3);



        Carrera1.inscribirParticipante(participanteCarrera1);
        Carrera1.inscribirParticipante(participanteCarrera2);
        Carrera1.inscribirParticipante(participanteCarrera3);
        Carrera1.inscribirParticipante(participanteCarrera4);


        System.out.println();
        equipo1.anadirJugador(participanteTorneo1);
        equipo1.anadirJugador(participanteTorneo1);

        System.out.println();
        equipo1.eliminarJugador(participanteTorneo1);
        equipo1.eliminarJugador(participanteTorneo1);
        System.out.println();

        equipo1.anadirJugador(participanteTorneo1);
        equipo1.anadirJugador(participanteTorneo2);
        equipo1.anadirJugador(participanteTorneo3);
        equipos.add(equipo1);
        equipos.add(equipo2);
        equipos.add(equipo3);

        System.out.println(equipo1);
        System.out.println(Torneo1);
        System.out.println(Carrera1);
        System.out.println(participanteCarrera1);
        System.out.println(participanteTorneo1);

        Torneo1.inscribirEquipo(equipo1);
        Torneo1.inscribirEquipo(equipo2);
        Torneo1.inscribirEquipo(equipo3);

        Torneo1.obtenerGanador();
        System.out.println(Carrera1.obtenerGanador());





        participanteCarrera1.toString();
        participanteCarrera2.toString();
        participanteCarrera3.toString();
        participanteCarrera4.toString();
        participanteTorneo1.toString();
        participanteTorneo2.toString();
        participanteTorneo3.toString();
        Torneo1.toString();
        equipo1.toString();
        equipo2.toString();
        equipo3.toString();



        Equipo equipoConMasPuntos = null;
        int maxPuntos = Integer.MIN_VALUE;

        for (Equipo equipo : equipos) {
            if (equipo.getPuntos() > maxPuntos) {
                maxPuntos = equipo.getPuntos();
                equipoConMasPuntos = equipo;
            }
        }
        if (equipoConMasPuntos != null) {
            System.out.println("El equipo con más puntos es: " + equipoConMasPuntos.getNombre() + " con " + equipoConMasPuntos.getPuntos() + " puntos.");
        } else {
            System.out.println("No hay equipos en la lista.");
        }

         



    }
}



