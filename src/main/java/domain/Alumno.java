package domain;

import java.util.List;

public class Alumno {
    private String nombre;
    private String legajo;
    private List<Materia> materiasAprobadas;

    public Alumno(String nombre, String legajo, Materia ... materiasAprobadas) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.materiasAprobadas = List.of(materiasAprobadas);
    }

    public boolean cumpleCorrelativas(Materia materia) {
        return materia.correlativasEstanContenidasEn(materiasAprobadas);
    }
}
