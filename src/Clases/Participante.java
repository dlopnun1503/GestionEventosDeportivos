package Clases;

public class Participante {

    //ATRIBUTOS DE CLASE
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    //CONSTRUCTOR DE CLASE
    public Participante(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    //METODOS DE CLASE
    @Override
    /**
     * Método toString que da detalles de la clase Participante.
     * @return Cadena de caracteres con atributos de la clase.
     */
    public String toString(){
        System.out.println( "Hola me llamo " +this.nombre+ " " +this.apellidos+ " y tengo " +this.edad+ " anios");
        return null;
    }

    @Override
    /**
     * Método que iguala un participante con otro
     * @return true si la persona ya existe | false si la persona no coincide
     */
    public boolean equals(Object o) {
        boolean personaExiste = false;
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participante participante = (Participante) o;
        if (dni.equals(participante.dni)){
            System.out.println("La persona ya existe");
            return true;
        }
        return personaExiste;
    }

    //GETTERS AND SETTERS
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
