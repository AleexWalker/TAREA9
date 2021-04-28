import java.util.Arrays;

public class Presencial extends Alumno {

    private double matriculaCurso;
    private int numeroConvocatoria;
    private double plusPorConvocatoria;

    public Presencial(String nombre, int edad, int curso, String nivelAcadémico, String[] listaAsignaturas, double matriculaCurso, int numeroConvocatoria, double plusPorConvocatoria) {
        super(nombre, edad, curso, nivelAcadémico, listaAsignaturas);
        this.matriculaCurso = matriculaCurso;
        this.numeroConvocatoria = numeroConvocatoria;
        this.plusPorConvocatoria = plusPorConvocatoria;
    }

    public Presencial(String nombre, int edad, int curso, String nivelAcadémico, String[] listaAsignaturas) {
        super(nombre, edad, curso, nivelAcadémico, listaAsignaturas);
    }

    @Override
    public double pagoMensual() {
        return (matriculaCurso + plusPorConvocatoria * numeroConvocatoria)/12;
    }

    @Override
    public String mostrarAsignaturas() {
        return "El estudiante presencial " + super.getNombre() + " cursa " + Arrays.toString(super.getListaAsignaturas());
    }
}
