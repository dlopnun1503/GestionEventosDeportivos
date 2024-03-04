import Clases.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Participante participanteCarrera1 = new ParticipanteCarrera("05339171C","Juan","Toro Gimeno",17,223);
        Participante participanteCarrera2 = new ParticipanteCarrera("49467087K","Francisco","Beltran Mateu",21,181);
        Participante participanteCarrera3 = new ParticipanteCarrera("18734366S","Maria","Campos Padilla",19,204);
        Participante participanteCarrera4 = new ParticipanteCarrera("01013859L","Laura","Gomez Sierra",20,198);

        EventoDeportivo Carrera1 = new Carrera("Maraton", LocalDateTime.now(), "Ciudad X", new ArrayList<>(), 42.195);

        Carrera1.obtenerGanador();

        Carrera1.inscribirParticipante(participanteCarrera1);
        Carrera1.inscribirParticipante(participanteCarrera2);
        Carrera1.inscribirParticipante(participanteCarrera3);
        Carrera1.inscribirParticipante(participanteCarrera4);

        System.out.println(Carrera1.obtenerGanador());

        Participante participanteTorneo1 = new Participante("00898876J","Carlos","Serrano",24);
        Participante participanteTorneo2 = new Participante("42108698E","Manuel","Teruel",30);
        Participante participanteTorneo3 = new Participante("41249244D","Santiago","Cabeza",26);

        Equipo equipo1 = new Equipo("Equipo1",200,new ArrayList<>());
        equipo1.anadirJugador(participanteTorneo1);
        equipo1.anadirJugador(participanteTorneo2);
        equipo1.anadirJugador(participanteTorneo3);

        TorneoDeFutbol Torneo1 = new TorneoDeFutbol("Copa Mundial",LocalDateTime.now(),"Barcelona",new ArrayList<>(),new ArrayList<>());
        Torneo1.inscribirEquipo(equipo1);

    }
}

