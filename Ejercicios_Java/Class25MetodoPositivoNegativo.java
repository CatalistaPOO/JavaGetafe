import java.util.Scanner;

public class Class25MetodoPositivoNegativo {
    public static void main(String[] args) {
        // Programa con un metodo que recibe un numero y devolvera
        // si el numero es positivo negativo o 0.
        // En el main principal tendremos un scanner que pedira
        // un numero al usuario que utilizaremos con el metodo

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Escribe un numero y te diré si es positivo");
        int n = Integer.parseInt(teclado.nextLine());
        teclado.close();

        System.out.println(esValorPositivo(n));
    }

    public static String esValorPositivo(int num){
        String respuesta= "";
        if (num > 0){
            respuesta = "El numero es positivo";
        }
        else if (num < 0){
            respuesta = "El numero es negativo";
        }
        else if (num == 0){
            respuesta = "El numero es 0";
        }
        return respuesta;
    }
}