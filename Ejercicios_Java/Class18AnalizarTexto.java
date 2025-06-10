import java.util.Scanner;

public class Class18AnalizarTexto {
    public static void main(String[] args) {
        // DEbemos utilizar la clase Character.
        // Pediremos culaquier texto al usuario y debemos indicar
        // los siguientes datos sobre el texto escrito:
        // -Texto: Hoy es martes 10 de junio de 25
        // ·numero de palabras :9
        // ·numero de digitos:4
        // ·numero de vocales: 6
        // ·numero de consonantes: 3
        // ·Mayusculas: 1

        Scanner teclado= new Scanner(System.in);

        System.out.println("Introduce un texto incluyendo números");
        String texto = teclado.nextLine();

        int nletras = 0;
        int digitos = 0;
        int vocales = 0;
        int consonantes = 0;
        int mayusculas = 0;
        for (int i = 0; i < texto.length(); i++){
            char letra = texto.charAt(i);
            if (Character.isDigit(letra) == false){
                if(Character.isWhitespace(letra) == false){
                    nletras ++;
                }
                if (Character.isUpperCase(letra) == true) {
                    mayusculas ++;
                }
               if ("aeiou".indexOf(Character.toLowerCase(letra)) != -1) {
                    vocales++;
                }
                else{
                    consonantes ++;
                }
            }
            else {
                digitos ++;
            }
        }
        System.out.println("El numero de letras es: " + nletras);
        System.out.println("El numero de digitos es: " + digitos);
        System.out.println("El numero de vocales es: " + vocales);
        System.out.println("El numero de consonantes es: " + consonantes);
        System.out.println("El numero de mayúsculas es: " + mayusculas);
        
    }
}