package Clases;

import java.util.ArrayList;

public class Equipo implements Comparable{

   //ATRIBUTOS DE CLASE
    private String nombre;
    private int puntos;
    private ArrayList<Participante> jugadores;

    //CONSTRUCTOR DE CLASE
    public Equipo(String nombre, int puntos, ArrayList<Participante> jugadores) {
        this.nombre = nombre;
        this.puntos = puntos;
        this.jugadores = jugadores;
    }

    //METODOS DE CLASE

    public boolean anadirJugador(Participante jugador) {
        boolean jugadorExiste = true;
        for (int i = 0; i < jugadores.size(); i++) {
            if (!jugador.getDni().equals(jugadores.get(i).getDni())){
                jugadorExiste = false;
                jugadores.add(jugador);
                System.out.println("Jugador anadido");
            }else {
                System.out.println("Este jugador ya esta anadido");
            }
        }
        return jugadorExiste;
    }

    public boolean eliminarJugador(Participante jugador) {
        boolean jugadorExiste = false;
        for (int i = 0; i < jugadores.size(); i++) {
            if (jugador.getDni().equals(jugadores.get(i).getDni())){
                jugadorExiste = true;
                jugadores.remove(jugador);
                System.out.println("Jugador eliminado");
            }else {
                System.out.println("Este jugador ya estaba eliminado");
            }
        }
        return jugadorExiste;
    }

    @Override
    public String toString() {
        for (int i = 0; i < jugadores.size(); i++) {
            return  "Equipo: " + this.nombre + " cuyos jugadores son " +jugadores.get(i).getNombre()+ " y este equipo tiene " +this.puntos+ " puntos";
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        boolean equipoExiste = false;
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipo equipo = (Equipo) o;
        if (nombre.equals(equipo.nombre)){
            System.out.println("El equipo ya existe");
            return true;
        }
        return equipoExiste;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }


    //GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public ArrayList<Participante> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Participante> jugadores) {
        this.jugadores = jugadores;
    }
}
