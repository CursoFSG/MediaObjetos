import java.util.Scanner;

public class Alumno {
    private Scanner lector = new Scanner(System.in);
    private String nombre;
    private String apellido;
    private float nota;

    public void setNota(float nota) throws Exception{
        if (nota>=0 && nota <=10){
            this.nota = nota;
        }
        else{
            throw new Exception("Parametro erroneo", null);
        }
    }

    public float getNota(){
        return nota;
    }

    public String getNombre(){
        return nombre + " " + apellido;
    }

    private float solicitarNota(String nombre){
        float resultado = 0;
        boolean fallo = true;
        do {
            try{
                System.out.println(nombre + " dime tu nota.");
                String numeroLeido = lector.nextLine();
                resultado = Float.parseFloat(numeroLeido);
                if (resultado >= 0 && resultado <= 10){
                    fallo = false;
                }
                else{
                    System.out.println("El valor tiene que estar entre 0 y  " + 10);
                }
            }
            catch (NullPointerException e){
                fallo = true;
                System.out.println("String vacio.");    
            }
            catch (Exception e){
                fallo = true;
                System.out.println("Valor inválido");
            }
        } while(fallo);
        //lector.close();
        return resultado;
    }

    public void alta() throws AlumnoExcepcion{
            System.out.println("Dime tu nombre:");
            this.nombre = lector.nextLine();
            System.out.println("Dime tu apellido:");
            this.apellido = lector.nextLine();
            if (nombre.equals("a")){
                throw new AlumnoExcepcion("No admitimos alumnos a");
            }

            this.nota = solicitarNota(nombre);
    }
}
