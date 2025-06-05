import java.util.Scanner;

public class Class02EjemploScanner {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca su nombre");
        String nombre = teclado.nextLine();
        System.out.println("Introduzca su edad");
        String edad = teclado.nextLine();
        System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad);
        System.out.println(("FIN DE PROGRAMA"));
    }
}
