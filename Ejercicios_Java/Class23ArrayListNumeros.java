import java.util.ArrayList;
import java.util.Scanner;

public class Class23ArrayListNumeros {
    public static void main(String[] args) {
        // Programa para almacenar numeros
        // Al final mostraremos la suma de los numeros y el listado de los numeros
        // Pediremos numeros hasta que el usuario introduzca el -1
        // No puede haber numeros repetidos, si se encuentra se debe indicar.

        Scanner teclado = new Scanner(System.in);
        ArrayList <String> numeros = new ArrayList<String>();
        String n = "";
        int suma = 0;

        System.out.println("Introduce número para almacenar (-1 para parar)");
        n = teclado.nextLine();
        
        while (n.equals("-1") == false) {
                if (numeros.contains(n) == true){
                    System.out.println("El numero ya está contenido en el array");
                }
                else
                {
                    numeros.add(n);
                    suma += Integer.parseInt(n);
                }
                System.out.println("Introduce número para almacenar (-1 para parar)");
                n = teclado.nextLine();
            }
        
        for (String numero: numeros){
                System.out.print(numero + ",");
            }

        System.out.println("");//salto de linea para separar resultado
        System.out.println("La suma es : " + suma);
        System.out.println("FIN");
    }
}
