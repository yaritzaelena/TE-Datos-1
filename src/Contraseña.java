import java.util.Scanner;

public class Contraseña {
    public static void main (String[] args){
        String C1, C2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Estimado usuario, ingrese su nueva contraseña.");
        C1 = entrada.next();
        System.out.println("Estimado usuario, repita su contraseña.");
        C2 = entrada.next();
        Excepciones Exc = new Excepciones();
        try{
            Exc.Valida(C1,C2);
            System.out.println("Su contraseña ha sido restaurada con éxito.");
        } catch (ExcPersonalizada e){
            System.out.println(e.getMessage());
        }
    }
}
