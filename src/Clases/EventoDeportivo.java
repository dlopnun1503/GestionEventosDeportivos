package Clases;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.spi.LocaleServiceProvider;

public abstract class EventoDeportivo implements Ganador{

    //ATRIBUTOS DE CLASE
    private String nombre;
    private LocalDateTime fecha;
    private String lugar;
    private ArrayList<Participante> participantes;

    //CONSTRUCTOR DE CLASE
    public EventoDeportivo(String nombre, LocalDateTime fecha, String lugar, ArrayList<Participante> participantes) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.participantes = participantes;
    }



    //METODOS DE CLASE
    @Override
    /**
     * Método que mete en un array al ganador del evento.
     * @return ArrayList<Participante> con el ganador.
     */
    public abstract ArrayList<Participante> obtenerGanador();

    /**
     *
     * @param participante
     * @return
     */
    public boolean inscribirParticipante(Participante participante) {
        for (int i = 0; i < participantes.size(); i++) {
            if (participante.getDni().equals(participantes.get(i).getDni())) {
                System.out.println("Este participante ya estÃ¡ inscrito.");
                return false;
            }
        }

        participantes.add(participante);
        System.out.println("Participante inscrito.");
        return true;
    }

    @Override
    /**
     * Método toString que da detalles del EventoDeportivo.
     * @return Cadena de caracteres con atributos.
     */
    public String toString() {
        System.out.println("Nombre: "+this.nombre+". Fecha: "+this.fecha+". Lugar: "+this.lugar+". Participantes: "+this.participantes);
        return null;
    }

    //GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Participante> participantes) {
        this.participantes = participantes;
    }
}
