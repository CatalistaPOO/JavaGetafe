
import java.util.ArrayList;
import java.util.Scanner;

public class Class27NumeroNarcisista {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe inicio del rango a comprobar narcisistas: ");
        int nInicio = Integer.parseInt(teclado.nextLine());
        
        System.out.println("Escribe final del rango a comprobar narcisistas: ");
        int nFinal = Integer.parseInt(teclado.nextLine());
        while (nFinal < nInicio){
            System.out.println("El final del rango debe ser mayor que el inicio: ");
            nFinal = Integer.parseInt(teclado.nextLine());
        }

        ArrayList<Integer> narcisistas = new ArrayList<Integer>();
        for (int i = nInicio; i <= nFinal; i++){
            if (evaluarNarcisista(i) == true){
                narcisistas.add(i);
            }
        }
        //Recorremos todos los números narcisistas
        for (int narci: narcisistas){
            System.out.print(narci + ", ");
        }
        System.out.println("Fin de programa");
    }

    public static boolean evaluarNarcisista(int numero){
        String dato = String.valueOf(numero);
        int longitud = dato.length();
        int suma = 0;
        for (int i = 0; i < longitud; i++){
            char letra = dato.charAt(i);
            String aux = String.valueOf(letra);
            int valor = Integer.parseInt(aux);
            int operacion = (int) Math.pow(valor, longitud);
            suma += operacion;
        }
        if (suma == numero){
            return true;
        }else{
            return false;
        }
    }
}