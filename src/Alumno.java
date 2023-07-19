import java.util.Scanner;

public class Alumno {
    private Scanner lector = new Scanner(System.in);
    private String nombre;
    private float nota;


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
            catch (Exception e){
                fallo = true;
                System.out.println("Valor inválido");
            }
        } while(fallo);
        //lector.close();
        return resultado;
    }

    public void alta(){
        System.out.println("Dime tu nombre:");
        this.nombre = lector.nextLine();
        this.nota = solicitarNota(nombre);
    }
}
