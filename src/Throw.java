//Throw exception
import java.util.Scanner;
public class Throw {
    public static void main(String args[]){
        int Edad, Restante;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Estimado usuario, ¿cuál es su edad?");
        Edad = entrada.nextInt();
        Restante = 18-Edad;
        if(Edad<18) {
            throw new ArithmeticException("Estimado usuario, usted aun es menor de edad, aun faltan" +" "+  Restante+" " + "años");
        }
        else
            System.out.print("Bienvenido al sistema de votacion");
    }

}
