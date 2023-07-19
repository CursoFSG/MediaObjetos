public class Curso {
    private final int NUMERO_ALUMNOS = 5;

    private float notaMedia;
    private Alumno[] alumnos;

    public float getNotaMedia(){
        return notaMedia;
    }

    public Curso(){
        notaMedia = -1;
        alumnos = new Alumno[NUMERO_ALUMNOS];
    }

    public void alta(){
        for (int n=0; n<NUMERO_ALUMNOS;n++){
            alumnos[n].alta();
        }
    }

    public void calcularMedia(){
        float sumaNotas = 0;
        for (int n=0; n<NUMERO_ALUMNOS;n++){
            sumaNotas = sumaNotas + alumnos[n].getNota();
        }
        this.notaMedia =  sumaNotas / NUMERO_ALUMNOS;
    }

    public Alumno[] dameAlumnosEncimaMedia(){
        Alumno[] lista = new Alumno[NUMERO_ALUMNOS];

        for (int n=0; n< NUMERO_ALUMNOS; n++){
            if (alumnos[n].getNota()>this.notaMedia){
                lista[n] = alumnos[n];
            }
            else{
                lista[n] = null;
            }
        }

        return lista;
    }

    public void escribeAlumnosEncimaMedia(){
        for (int n=0; n< NUMERO_ALUMNOS; n++){
            if (alumnos[n].getNota()>this.notaMedia){
               System.out.println(alumnos[n].getNombre());
            }
           
        }
    }
}
