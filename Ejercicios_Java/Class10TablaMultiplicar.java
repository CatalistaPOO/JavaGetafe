import java.util.Scanner;

public class Class10TablaMultiplicar {
    public static void main(String[] args) {
        // PEDIR AL USUARIO NUMERO Y MOSTRAR LA TABLA DE DICHO NUMERO

        String dato;
        Scanner teclado;

        System.out.println("Elige la tabla de multiplicar escribiendo su numero");
        teclado = new Scanner(System.in);
        dato = teclado.nextLine();
        int nTabla = Integer.parseInt(dato);

        teclado.close(); // Cierra el scanner

        System.out.println("------------------------------");
        System.out.println("TABLA DEL " + nTabla);
        System.out.println("------------------------------");
        
        for (int i= 1; i <= 10; i++){
            System.out.println(nTabla +  " X " + i + "= " + i * nTabla);
        }
       
    }
}
