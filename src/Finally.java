import java.util.Scanner;

public class Finally {
    public static void main (String[] args){
        int R;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Estimado cliente, que articulo desea consultar en nuestro catalogo: 1. Microondas, 2. Cocina, 3. Horno");
        try {
            R = entrada.nextInt();
            if (R == 1) {
                System.out.println("El precio de este articulo es de 43.500 colones.");
            }
            if (R == 2) {
                System.out.println("El precio de este articulo es de 120.400 colones.");
            }
            if (R == 3) {
                System.out.println("El precio de este articulo es de 53.800 colones.");
            }
        } catch (Exception e){
            System.out.println("Necesito una opcion numerica del 1 al 3");
        }
        finally {
            System.out.println("Proceso terminado, gracias por consultar nuestro catalogo");
        }
    }
}
