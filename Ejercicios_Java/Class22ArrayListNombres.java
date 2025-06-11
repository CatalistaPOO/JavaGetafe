import java.util.ArrayList;
import java.util.Scanner;

public class Class22ArrayListNombres {
    public static void main(String[] args) {
        // Programa que pida nombres.
        // Si escribimos stop, termina la peticion de nombres.
        // Se mostrará un listado con todos los nombre recopilados
        // Tambien se mostrara el total de nombres en nuestra colección
        Scanner teclado = new Scanner(System.in);

        System.out.println("");
        System.out.println("----------------------------------------------------------");
        System.out.println("Crearemos una coleccion con nombres, (STOP) para finalizar");
        System.out.println("----------------------------------------------------------");

        ArrayList<String> nombres = new ArrayList<String>();
        boolean stop = false;//solo para primera solucion con primer bucle

        //PRIMERA SOLUCION CON BUCLE (2 VARIABLES(dato y stop))
        // while (stop != true){
        //     System.out.println("Introduce nombre (STOP para finalizar): ");
        //     String dato = teclado.nextLine();
        //     if (dato.equalsIgnoreCase("stop")){ //para que sea indiferente mayusculas o minusculas
        //         stop = true;
        //     }
        //     else{
        //         nombres.add(dato);
        //     }
        // }

        //SEGUNDA SOLUCION CON BUCLE (1VARIABLE (dato))
        System.out.println("Introduce nombre (STOP para finalizar): ");
        String dato = teclado.nextLine();
        while (dato.equalsIgnoreCase("stop") == false){
            nombres.add(dato);
            System.out.println("Introduce nombre (STOP para finalizar): ");
            dato = teclado.nextLine();
        }

        System.out.println("Hay " + nombres.size() + " nombres");
        //IMPRIMIR ELEMENTOS SABIENDO SU LONGITUD
        // for(int i = 0 ;i < nombres.size();i++){
        //     System.out.print(nombres.get(i) + ",");
        // }

        //IMPRIMIR ELEMENTOS SIN PREOUPARNOS DE LA LONGITUD
        for (String name: nombres){
                System.out.print(name + ",");
        }

        System.out.println("");
    }
}

