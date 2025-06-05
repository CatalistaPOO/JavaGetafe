import java.util.Scanner;

public class Class11Collatz {
    public static void main(String[] args) {
        //Teoria matematica de Collatz:
        // Todo numero positivo llegara siempre a 1 siguiendo estas condiciones:
        // - Si el numero es par, se divide entre 2
        // -Si el numero es impar, se multiplica por 3 y se suma 1

        Scanner teclado;
        String dato;
        int numero;

        System.out.println("Introduce número para demostracion de la teoría de Collatz: ");
        teclado = new Scanner(System.in);
        dato = teclado.nextLine();
        numero = Integer.parseInt(dato);

        while (numero != 1){
                if (numero % 2 == 0){
                    // System.out.println("Reduciendo numero par a 1: " + numero);
                    numero /= 2;
                }
                else{
                    // System.out.println("Reduciendo número impar a 1: " + numero);
                    numero = (numero * 3) + 1;
                 }
                System.out.println( numero);
                }
                
            System.out.println("El numero ha alcanzado el valor 1");
            System.out.println("FIN DE PROGRAMA");
        
    }
}

