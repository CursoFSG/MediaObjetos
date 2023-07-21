import java.util.ArrayList;

public class Curso {
    private final int NUMERO_ALUMNOS = 5;

    private float notaMedia;
    private ArrayList<Alumno> alumnos;

    public float getNotaMedia(){
        return notaMedia;
    }

    public Curso(){
        notaMedia = -1;
        alumnos = new ArrayList<Alumno>();
    }

    public void alta(){
        Alumno alumno;
        for (int n=0; n<NUMERO_ALUMNOS;n++){
            alumno = new Alumno();
            alumno.alta();
            alumnos.add(alumno);
        }
    }

    public void calcularMedia(){
        float sumaNotas = 0;
        /*for (int n=0; n<NUMERO_ALUMNOS;n++){
            sumaNotas = sumaNotas + alumnos.get(n).getNota();
        }*/

        for (Alumno alumno : alumnos) {
            sumaNotas = sumaNotas + alumno.getNota();
        }


        this.notaMedia =  sumaNotas / NUMERO_ALUMNOS;
    }

    public ArrayList<Alumno> dameAlumnosEncimaMedia(){
        ArrayList<Alumno> lista = new ArrayList<Alumno>();

       /* for (int n=0; n< NUMERO_ALUMNOS; n++){
            if (alumnos[n].getNota()>this.notaMedia){
                lista[n] = alumnos[n];
            }
            else{
                lista[n] = null;
            }
        }*/

        for (Alumno al : alumnos){
            if (al.getNota()>this.notaMedia){
                lista.add(al);
            }
        }

        return lista;
    }

    public void escribeAlumnosEncimaMedia(){
        for (Alumno alumno : alumnos){
            if (alumno.getNota()>this.notaMedia){
               System.out.println(alumno.getNombre());
            }
           
        }
    }
}
