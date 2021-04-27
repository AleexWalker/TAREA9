import java.util.Arrays;

public abstract class Alumno extends Persona {

    private int curso;
    private String nivelAcadémico;
    private String [] listaAsignaturas;

    public Alumno(String nombre, int edad, int curso, String nivelAcadémico, String[] listaAsignaturas) {
        super(nombre, edad);
        this.curso = curso;
        this.nivelAcadémico = nivelAcadémico;
        this.listaAsignaturas = listaAsignaturas;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public void setListaAsignaturas(String[] listaAsignaturas) {
        this.listaAsignaturas = listaAsignaturas;
    }

    public String[] getListaAsignaturas() {
        return listaAsignaturas;
    }

    public abstract double pagoMensual();

    public abstract String mostrarAsignaturas();

    @Override
    public String toString() {
        return super.toString() +
                "curso=" + curso +
                ", nivelAcadémico='" + nivelAcadémico + '\'' +
                ", listaAsignaturas=" + Arrays.toString(listaAsignaturas) +
                '}';
    }
}
