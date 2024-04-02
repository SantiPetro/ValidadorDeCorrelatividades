package domain;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    public Materia(String nombre, Materia ... correlativas) {
        this.nombre = nombre;
        this.correlativas = List.of(correlativas);
    }

    public String getNombre() {
        return nombre;
    }

    public boolean correlativasEstanContenidasEn(List<Materia> materias) {
        return materias.containsAll(correlativas);
    }
}
