package domain;

import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    public Inscripcion(Alumno alumno, Materia ... materias) {
        this.alumno = alumno;
        this.materias = List.of(materias);
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public boolean aprobada() {
        return materias.stream().allMatch(materia -> alumno.cumpleCorrelativas(materia));
    }
}

