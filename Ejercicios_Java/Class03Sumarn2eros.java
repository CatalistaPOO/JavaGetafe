import java.util.Scanner;




public class Class03Sumarn2eros {
    public static void main(String[] args) {

        //SUMA DE DOS n2EROS

        //crear objeto
        Scanner teclado = new Scanner(System.in);
       
        //solicitar datos y usar objeto para capturar entrada teclado,
        //1º como string y conversion despues a int
        System.out.println("Escribe un n2ero: ");
        String dato = teclado.nextLine();
        int n1 = Integer.parseInt(dato);
        
        // Equivale a: int n1 = Integer.parseInt(teclado.nextLine());
        
        //solicitar datos y usar objeto para capturar entrada teclado,
        //1º como string y conversion despues a int
        System.out.println("introduce otro n2ero: ");
        dato = teclado.nextLine();
        int n2 = Integer.parseInt(dato);
        // Equivale a: int n2 = Integer.parseInt(teclado.nextLine());

        //variable para calular la suma de variables e imprimir en pantalla
        int suma = n1 +n2; 
        System.out.println("la suma de " + n1 + "y de " + n2 + "es: " + suma);
        
        System.out.println("Fin de programa");
    }
}
