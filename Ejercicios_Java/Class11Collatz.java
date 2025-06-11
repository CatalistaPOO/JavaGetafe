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

        teclado.close(); // Cierra el scanner

        System.out.println(
        "------------------------------------------------------------------------" + "\n" +
        "TEORIA DE COLLATZ A PARTIR DEL NUMERO: " + numero + "\n" +
        "Todo numero positivo llegara siempre a 1 siguiendo estas condiciones: \n" +
        " - Si el numero es par, se divide entre 2 \n" +
        " - Si el numero es impar, se multiplica por 3 y se suma 1) \n" +
        "------------------------------------------------------------------------"
        );

        while (numero != 1){
                if (numero % 2 == 0){
                    System.out.println(numero + "/2= " + (numero /= 2));
                }
                else{
                    System.out.println("(" + numero + "*3)+1= " + (numero = (numero * 3) + 1));
                 }
                }
        System.out.println("El numero ha alcanzado el valor 1");
        System.out.println("FIN DE PROGRAMA");
        
    }
}

