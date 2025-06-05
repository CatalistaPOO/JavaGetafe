
/* 
SNIPETS:
    psvm: public static void main
    sout: System.out.println()

*/

import java.util.Scanner;

public class Class01Primitivos {

    public static void main(String[] args) { //psvm

        // CONVERSION AUTOMATICA
        //byte menor = 15;
        //int mayor = menor;
        //menor = mayor; //da error por guardar tipo de dato mayor en menor


        //CONVERSION ENTRE PRIMITIVOS
        // int mayor = 15;
        // byte menor = (byte) mayor;//conversion entre tipos

        //CONVERTIR CUALQUIER OBJETO A STRING
        // String texto = "12";
        //mayor = texto; //da error porque no utiliza el metodo to string contenido en la clase objeto
        //utilizamos la clase grande (int es la pequeña y
        // Integer(con mayuscula) es la grande que contiene los métodos (en este caso toString))
        // texto = Integer.toString(mayor);
        // texto = Byte.toString(menor);

        // int n2ero = 15;
        // String texto = n2ero;//Da error
        // String texto = String.valueOf(n2ero);
        // System.out.println("Fin de programa");//sout

        //CONVERTIR UN PRIMITIVO A STRING
        // String texto = "12";
        // int variable = Integer.parseInt(texto);//permite convertir texto a n2ero
        // String textito = "12A";
        // int otravariable = Integer.parseInt(textito);//dará error porque 12A no equivale a ningún nuemro por la A

        //OBJETOS Y LIBRERIAS
        // creamos el objeto scanner,requiere la llamada
        // de libreria con import al principio del archivo
        Scanner teclado = new Scanner(System.in); 
        //pedimos al usuario su nombre
        System.out.println("Introduzca su nombre");
        //almacenamos en variable lo que escribe el usuario
        String nombre = teclado.nextLine();
        //utilizamos la variable con el nombre de la persona
        System.out.println("Bienvenido a Java " + nombre);
    }
}