import java.util.ArrayList;

public class Aplicación {
    public static void main(String[] args) {

        Profesor profesorFísica = new Profesor("Albert" , 50, "Física");
        Profesor profesorEléctrica = new Profesor("Tesla" , 35, "Eléctrica");
        Profesor profesorMedicina = new Profesor("Hipócrates" , 54, "Medicina");
        Profesor profesorPsicología = new Profesor("Platón" , 28, "Psicología");
        Profesor profesorMatemáticas = new Profesor("Turing" , 38, "Matemáticas");

        ArrayList<Profesor> listaProfesorado = new ArrayList<Profesor>();

        listaProfesorado.add(profesorFísica);
        listaProfesorado.add(profesorEléctrica);
        listaProfesorado.add(profesorMedicina);
        listaProfesorado.add(profesorPsicología);
        listaProfesorado.add(profesorMatemáticas);

        for (int i = 0 ; i <= 4 ; i++ )
            System.out.println(listaProfesorado.get(i));

        ArrayList<Alumno> listaAlumnado = new ArrayList<Alumno>();

        String[] asignaturasPrimerAlumno = { "Física" , "Matemáticas"};
        String[] asignaturasSegundoAlumno = { "Psicología"};
        String[] asignaturasTercerAlumno = { "Eléctrica" , "Matemáticas" , "Medicina"};
        String[] asignaturasCuartoAlumno = { "Psicología" , "Física" , "Medicina"};
        String[] asignaturasQuintoAlumno = { "Física" , "Matemáticas" , "Eléctrica" , "Medicina"};

        Alumno alumnoPrimero = new Libre("Newton" , 21 , 3 , "Universitario" , asignaturasPrimerAlumno , 3);
        Alumno alumnoSegundo = new Libre("Arquímedes" , 24 , 4 , "Universitario" , asignaturasSegundoAlumno , 5);
        Alumno alumnoTercero = new Presencial("Nobel" , 25 , 2 , "Máster" , asignaturasTercerAlumno , 880.25 , 1 , 50);
        Alumno alumnoCuarto = new Presencial("Curie" , 28 , 1 , "Doctorado" , asignaturasCuartoAlumno , 705.50 , 1 , 50);
        Alumno alumnoQuinto = new Presencial("Da Vinci" , 27 , 3 , "Máster" , asignaturasQuintoAlumno , 525.75 , 2 , 150);
        listaAlumnado.add(alumnoPrimero);
        listaAlumnado.add(alumnoSegundo);
        listaAlumnado.add(alumnoTercero);
        listaAlumnado.add(alumnoCuarto);
        listaAlumnado.add(alumnoQuinto);

        System.out.println("----------------LISTADO DE ALUMNOS/ASIGNATURAS----------------");
        System.out.println(alumnoPrimero.mostrarAsignaturas());
        System.out.println(alumnoSegundo.mostrarAsignaturas());
        System.out.println(alumnoTercero.mostrarAsignaturas());
        System.out.println(alumnoCuarto.mostrarAsignaturas());
        System.out.println(alumnoQuinto.mostrarAsignaturas());

        System.out.println("----------------LISTADO DE PAGOS----------------");
        System.out.println(alumnoPrimero.pagoMensual());
        System.out.println(alumnoSegundo.pagoMensual());
        System.out.println(alumnoTercero.pagoMensual());
        System.out.println(alumnoCuarto.pagoMensual());
        System.out.println(alumnoQuinto.pagoMensual());

    }
}
