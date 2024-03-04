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
    /**
     * Método toString que da detalles de la clase ParticipanteCarrera.
     * @return Cadena de caracteres con atributos de la clase.
     */
    @Override
    public String toString(){
        System.out.println("Hola me llamo " +getNombre()+ " " +getApellidos()+ " y tengo " +getEdad()+ " anios y he hecho un tiempo de " +this.tiempo+" segundos.");
        return null;
    }

    //GETTERS AND SETTERS

    public double getTiempo() {
        return tiempo;
    }
}



