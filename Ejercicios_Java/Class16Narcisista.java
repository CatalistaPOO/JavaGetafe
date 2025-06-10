import java.util.Scanner;

public class Class16Narcisista {
    public static void main(String[] args) {
        //NUMERO NARCISISTA
        // Un numero narcisista es aquel en que la suma de
        // la potencia de su longitud es el mismo resultado que
        // que el numero introducido
        // 153 es narcisista
        // Longitud: 3(potencia a 3)
        // 1x1x1 = 1
        // 5x5x5= 125
        // 3x3x3 = 27
        // 125 + 27 + 1 = 153

        Scanner teclado = new Scanner(System.in);
        int suma = 0;

        System.out.println("Introduce número para saber es narcisista");
        String narcisista = teclado.nextLine();

        for (int i = 0; i < narcisista.length(); i++){
            int longitud = narcisista.length();
            char letra = narcisista.charAt(i);
            //convertir la letra a String
            String letraToString =  Character.toString(letra);
            //convertimos el string a numero
            int numero = Integer.parseInt(letraToString);
            suma += Math.pow(numero,longitud);

            // //Equivale al contenido de for, que realiza todas las conversiones
            // suma += Math.pow(Integer.parseInt(Character.toString(narcisista.charAt(i))), narcisista.length());

        }
        if (suma == Integer.parseInt(narcisista)){
            System.out.println("El " + narcisista + " es NARCISISTA");
        }
        else{
            System.out.println("El " + narcisista + " NO es narcisista");
        }
    }
}
