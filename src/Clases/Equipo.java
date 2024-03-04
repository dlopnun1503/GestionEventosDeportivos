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

    /**
     * Método que añade jugadores al ArrayList de jugadores.
     * @param jugador El parámetro jugador define el jugador que será añadido al ArrayList de jugadores de un equipo.
     * @return true si se ha añadido correctamente al equipo | false si no se ha añadido correctamente al equipo.
     */
    public boolean anadirJugador(Participante jugador) {
        boolean jugadorExiste = false;
        for (int i = 0; i < jugadores.size(); i++) {
            if (jugador.getDni().equals(jugadores.get(i).getDni())) {
                jugadorExiste = true;
                break;
            }
        }

        if (!jugadorExiste) {
            jugadores.add(jugador);
            System.out.println("Jugador añadido al equipo correctamente.");
        } else {
            System.out.println("Jugador no añadido al equipo correctamente.");
        }
        return jugadorExiste;
    }

    /**
     * Método que añade jugadores al ArrayList de jugadores.
     * @param jugador El parámetro jugador define el jugador que será eliminado del ArrayList de jugadores de un equipo.
     * @return true si se ha añadido correctamente al equipo | false si no se ha añadido correctamente al equipo.
     */
    public boolean eliminarJugador(Participante jugador) {
        boolean jugadorExiste = false;
        for (int i = 0; i < jugadores.size(); i++) {
            if (jugador.getDni().equals(jugadores.get(i).getDni())) {
                jugadorExiste = true;
                jugadores.remove(i);
                System.out.println("Jugador eliminado del equipo correctamente.");
                break;
            }
        }

        if (!jugadorExiste) {
            System.out.println("Jugador no encontrado en el equipo.");
        }

        return jugadorExiste;
    }


    @Override
    /**
     * Método toString que da detalles del Equipo.
     * @return Cadena de caracteres con atributos de la clase.
     */
    public String toString() {
        System.out.println("Equipo: " + this.nombre );
        return null;
    }


    /**
     * Método equals que compara objetos
     * @param o El parámetro o es un equipo que será comparado con otro para saber si ya existía.
     * @return true si el equipo ya existía | false si el equipo no existía.
     */
    @Override
    public boolean equals(Object o) {
        boolean equipoExiste = false;
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipo equipo = (Equipo) o;
        if (nombre.equals(equipo.nombre)){
            System.out.println("El equipo ya existe.");
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

