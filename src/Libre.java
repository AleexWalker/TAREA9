import java.util.Arrays;

public class Libre extends Alumno {

    private final float PRECIO_HORA = 10;
    private int numeroHorasDiarias;

    public Libre(String nombre, int edad, int curso, String nivelAcadémico, String[] listaAsignaturas, int numeroHorasDiarias) {
        super(nombre, edad, curso, nivelAcadémico, listaAsignaturas);
        this.numeroHorasDiarias = numeroHorasDiarias;
    }

    @Override
    public double pagoMensual() {
        System.out.println("El alumno " + super.getNombre() + "está pagando:");
        return PRECIO_HORA * numeroHorasDiarias * 30;
    }

    @Override
    public String  mostrarAsignaturas() {
        return "El estudiante libre " + super.getNombre() + " cursa " + Arrays.toString(super.getListaAsignaturas());
    }
}
