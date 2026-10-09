import java.util.ArrayList;
import java.util.List;

class Estudiante {
    private String nombre;
    private List<Asignatura> asignaturas;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.asignaturas = new ArrayList<>();
    }

    public void matricular(Asignatura asignatura) {
        asignaturas.add(asignatura);
        asignatura.agregarEstudiante(this);
    }

    public String getNombre() {
        return nombre;
    }
}

class Asignatura {
    private String nombre;
    private List<Estudiante> estudiantes;

    public Asignatura(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (!estudiantes.contains(estudiante)) {
            estudiantes.add(estudiante);
        }
    }

    public String getNombre() {
        return nombre;
    }
}

public class AsociacionMuchosAMuchos {
    public static void main(String[] args) {
        Estudiante ana = new Estudiante("Ana");
        Estudiante juan = new Estudiante("Juan");

        Asignatura programacion = new Asignatura("Programación");
        Asignatura algebra = new Asignatura("Álgebra");

        ana.matricular(programacion);
        ana.matricular(algebra);
        juan.matricular(programacion);

        System.out.println(
            ana.getNombre() + " está matriculada en varias asignaturas."
        );
        System.out.println(
            juan.getNombre() + " también está matriculado en Programación."
        );
    }
}
