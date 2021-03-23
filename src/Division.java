import java.util.Scanner;
public class Division {
    public static void main (String[] args){
        int V1, V2, R;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Estimado usuario, ingrese el primer valor");
        V1 = entrada.nextInt();
        System.out.println("Estimado usuario, ingrese el segundo valor");
        V2 = entrada.nextInt();
        try {
            R = V1/V2;
            System.out.println("El resultado de la division es: "+" "+R);
        } catch (Exception e){
            System.out.println("Estimado usuario, la division es invalida, el denominador (segundo valor) no puede ser 0");
        }

    }
}
