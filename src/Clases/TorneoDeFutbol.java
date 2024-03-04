package Clases;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.spi.LocaleServiceProvider;

public class TorneoDeFutbol extends EventoDeportivo{

    //METODOS DE CLASE
    private ArrayList<Equipo> equipos;

    //CONSTRUCTOR DE CLASE
    public TorneoDeFutbol(String nombre, LocalDateTime fecha, String lugar, ArrayList<Participante> participantes, ArrayList<Equipo> equipos) {
        super(nombre, fecha, lugar, participantes);
        this.equipos = new ArrayList<Equipo>();
    }

    //METODOS DE CLASE
    public boolean inscribirEquipo(Equipo equipo) {
        boolean equipoExiste = true;
        for (int i = 0; i < equipos.size(); i++) {
            if (!equipo.getNombre().equals(equipos.get(i).getNombre())){
                equipoExiste = false;
                equipos.add(equipo);
                System.out.println("Equipo inscrito");
            }else {
                System.out.println("Este equipo ya esta inscrito");
            }
        }
        return equipoExiste;
    }

    @Override
    public ArrayList<Participante> obtenerGanador() {
        if (equipos.isEmpty()) {
            System.out.println("No hay equipos inscritos en el torneo.");
            return new ArrayList<>(); // Devolver una lista vacÃ­a en este caso
        }

        // Encontrar el equipo con la mayor cantidad de puntos
        Equipo equipoGanador = encontrarEquipoGanador();

        if (equipoGanador != null) {
            System.out.println("El equipo ganador del torneo es: " + equipoGanador.getNombre());
            return equipoGanador.getJugadores();
        } else {
            System.out.println("No se pudo determinar el ganador del torneo.");
            return new ArrayList<>(); // Devolver una lista vacÃ­a en este caso
        }
    }

    private Equipo encontrarEquipoGanador() {
        Equipo equipoGanador = null;
        int maxPuntos = Integer.MIN_VALUE;

        for (Equipo equipo : equipos) {
            if (equipo.getPuntos() > maxPuntos) {
                maxPuntos = equipo.getPuntos();
                equipoGanador = equipo;
            }
        }

        return equipoGanador;
    }
}

