package Clases;

import java.util.ArrayList;
import java.util.spi.LocaleServiceProvider;

public class TorneoDeFutbol extends EventoDeportivo{

    //METODOS DE CLASE
    private ArrayList<Equipo> equipos;

    //CONSTRUCTOR DE CLASE
    public TorneoDeFutbol(String nombre, LocaleServiceProvider fecha, String lugar, ArrayList<Participante> participantes, ArrayList<Equipo> equipos) {
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
}
