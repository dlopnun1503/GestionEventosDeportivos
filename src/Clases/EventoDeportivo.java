package Clases;

import java.util.ArrayList;
import java.util.spi.LocaleServiceProvider;

public abstract class EventoDeportivo implements Ganador{

    //ATRIBUTOS DE CLASE
    private String nombre;
    private LocaleServiceProvider fecha;
    private String lugar;
    private ArrayList<Participante> participantes;

    //CONSTRUCTOR DE CLASE
    public EventoDeportivo(String nombre, LocaleServiceProvider fecha, String lugar, ArrayList<Participante> participantes) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.participantes = new ArrayList<>();
    }



    //METODOS DE CLASE
    @Override
    public void obtenerGanador(Participante participante) {
        System.out.println("El ganador es " +participante.getNombre()+ " " +participante.getApellidos());
    }

    public boolean inscribirParticipante(Participante participante) {
        boolean participanteExiste = true;
        for (int i = 0; i < participantes.size(); i++) {
            if (!participante.getDni().equals(participantes.get(i).getDni())){
                participanteExiste = false;
                participantes.add(participante);
                System.out.println("Participante inscrito");
            }else {
                System.out.println("Este participante ya esta inscrito");
            }
        }
        return participanteExiste;
    }

    //GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocaleServiceProvider getFecha() {
        return fecha;
    }

    public void setFecha(LocaleServiceProvider fecha) {
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
