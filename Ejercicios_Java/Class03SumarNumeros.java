import java.util.Scanner;

public class Class03SumarNumeros {
    public static void main(String[] args) {

        //SUMA DE DOS NÚMEROS

        //crear objeto para leer teclado
        Scanner teclado = new Scanner(System.in);
       
        //solicitar datos y usar objeto para capturar entrada teclado,
        //1º como string y conversion despues a int
        System.out.println("Escribe un número: ");
        String dato = teclado.nextLine();
        int n1 = Integer.parseInt(dato);
        
        // Equivale a: 
        // int n1 = Integer.parseInt(teclado.nextLine());
        
        //solicitar datos y usar objeto para capturar entrada teclado,
        //1º como string y conversion despues a int
        System.out.println("introduce otro número: ");
        dato = teclado.nextLine();
        int n2 = Integer.parseInt(dato);
        // Equivale a: 
        // int n2 = Integer.parseInt(teclado.nextLine());

        //variable para almacenar la suma de variables y salida por consola
        int suma = n1 +n2; 
        System.out.println("Suma: " + n1 + "+" + n2 + "= " + suma);
        
        System.out.println("FIN DE PROGRAMA");
    }
}