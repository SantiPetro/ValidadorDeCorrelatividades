package domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class test {
    private Materia algoritmos;
    private Materia paradigmasDeProgramacion;
    private Materia disenioDeSistemas;

    private Alumno ezequiel;
    private Alumno lucas;
    private Alumno santi;


    @Before
    public void inicializar() {
        algoritmos = new Materia("Algoritmos");

        paradigmasDeProgramacion = new Materia("Paradigmas De Programacion", algoritmos);

        disenioDeSistemas = new Materia("Diseño De Sistemas", paradigmasDeProgramacion);

        ezequiel = new Alumno("Ezequiel", "unLegajo", algoritmos, paradigmasDeProgramacion);

        lucas = new Alumno("Lucas", "unLegajo", algoritmos, paradigmasDeProgramacion);

        santi = new Alumno("Santi", "unLegajo");

    }

    @Test
    public void inscripcionAprobada() {
        Inscripcion inscripcionEzequiel = new Inscripcion(ezequiel, disenioDeSistemas);
        Assert.assertTrue(inscripcionEzequiel.aprobada());

        Inscripcion inscripcionLucas = new Inscripcion(lucas, disenioDeSistemas);
        Assert.assertTrue(inscripcionLucas.aprobada());
    }

    @Test
    public void inscripcionRechazada() {
        Inscripcion inscripcionSanti = new Inscripcion(santi, paradigmasDeProgramacion);
        /*System.out.println(inscripcionSanti.getMaterias().get(0).getNombre());*/
        Assert.assertFalse(inscripcionSanti.aprobada());
    }
}
