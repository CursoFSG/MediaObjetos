public class App {
    public static void main(String[] args) throws Exception {
        Curso curso = new Curso();

        curso.alta();
        curso.calcularMedia();
        float media = curso.getNotaMedia();
        System.out.println("La media es : " + media);


        Alumno[] alumnosEncimaMedia = curso.dameAlumnosEncimaMedia();
        for (int posicionAlumno = 0; posicionAlumno<alumnosEncimaMedia.length; posicionAlumno++){
            if ( alumnosEncimaMedia[posicionAlumno]!= null){
                System.out.println(alumnosEncimaMedia[posicionAlumno].getNombre());
            }
        }


        curso.escribeAlumnosEncimaMedia();
    }
}
