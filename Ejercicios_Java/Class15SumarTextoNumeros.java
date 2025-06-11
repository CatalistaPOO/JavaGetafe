import java.util.Scanner;

public class Class15SumarTextoNumeros {
    public static void main(String[] args) {
        //SUMAR LOS CARACTERES DE UN TEXTO
        // Pedimos un texto al usuario y mostraremos la suma de los caracteres del texto
        int suma = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un texto para averiguar su suma de caractéres");
        String textoNumeros = teclado.nextLine();

        teclado.close(); // Cierra el scanner

        for (int i = 0; i < textoNumeros.length(); i++){
            char letra = textoNumeros.charAt(i);
            String aux = String.valueOf(letra);
            int numero = Integer.parseInt(aux);
            suma += numero;

            //Equivale a el contenido de for (hace conversion de valores):
            // suma += Integer.parseInt(String.valueOf(textoNumeros.charAt(i)));
        }
        System.out.println("la suma de los caracteres es: " + suma);
    }
}


