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
        this.equipos = equipos;
    }

    //METODOS DE CLASE

    /**
     * Método que inscribe un equipo a un torneo de fútbol.
     * @param equipo El parámetro equipo define el equipo que será introducido en el ArrayList de equipos del torneo de fútbol.
     * @return true si se ha podido ingresar correctamente el equipo | false si no se ha podido ingresar correctamente.
     */
    public boolean inscribirEquipo(Equipo equipo) {
        boolean equipoExiste = false;
        for (int i = 0; i < equipos.size(); i++) {
            if (equipo.getNombre().equals(equipos.get(i).getNombre())) {
                equipoExiste = true;
                System.out.println("Este equipo ya está inscrito");
                break;
            }
        }

        if (!equipoExiste) {
            equipos.add(equipo);
            System.out.println("Equipo inscrito");
        }

        return !equipoExiste;
    }

    @Override
    /**
     * Método que muestra el nombre del equipo ganador.
     * @return Jugadores del equipo ganador.
     */
    public ArrayList<Participante> obtenerGanador() {
        if (equipos.isEmpty()) {
            System.out.println("No hay equipos inscritos en el torneo.");
            return new ArrayList<>();
        }

        Equipo equipoGanador = encontrarEquipoGanador();


        System.out.println("El equipo ganador del torneo es: " + equipoGanador.getNombre());
        return equipoGanador.getJugadores();
    }

    /**
     * Método que encuentra al equipo con más puntos.
     * @return Equipo ganador.
     */
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



