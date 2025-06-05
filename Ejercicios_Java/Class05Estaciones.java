import java.util.Scanner;

public class Class05Estaciones {
    public static void main(String[] args) {
        //PEDIR n2ERO A USUARIO ENTRE 1 Y 4 PARA INDICAR ESTACION DEL AÑO EQUIVALENTE
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce n2ero del 1 a 4 para indicar estacion: ");
        String dato = teclado.nextLine();
        int n = Integer.parseInt(dato);

        if (n == 1){
            System.out.println("PRIMAVERA");
        }
        else if (n == 2){
            System.out.println("VERANO");
        }
        else if (n == 3){
            System.out.println("OTOÑO");
        }
        else if (n == 4){
            System.out.println("INVIERNO");
        }
        else{
            System.out.println("ERROR, el número no está entre 1 y 4");
        }

        System.out.println("Fin de programa");
    
    }
}