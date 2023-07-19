public class Curso {
    private final int NUMERO_ALUMNOS = 5;

    private float notaMedia;
    private Alumno[] alumnos;

    public Curso(){
        notaMedia = -1;
        alumnos = new Alumno[NUMERO_ALUMNOS];
    }

    public void alta(){
        for (int n=0; n<NUMERO_ALUMNOS;n++){
            alumnos[n].alta();
        }
    }
}
