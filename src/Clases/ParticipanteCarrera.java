package Clases;

public class ParticipanteCarrera extends Participante{

    //ATRIBUTOS DE CLASE
    private final double tiempo;

    //CONSTRUCTOR DE CLASE
    public ParticipanteCarrera(String dni, String nombre, String apellidos, int edad, double tiempo) {
        super(dni, nombre, apellidos, edad);
        this.tiempo = tiempo;
    }

    //METODOS DE CLASE
    @Override
    public String toString(){
        return "Hola me llamo " +getNombre()+ " " +getApellidos()+ " y tengo " +getEdad()+ " anios y he hecho un tiempo de " +this.tiempo+" segundos.";
    }

    //GETTERS AND SETTERS

    public double getTiempo() {
        return tiempo;
    }
}

