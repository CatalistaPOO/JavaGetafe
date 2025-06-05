import java.util.Scanner;

public class Class09Bucles {
    public static void main(String[] args) {
        //BUCLE CONTADOR FOR, sabemos cuantas veces se repite.
        // se indica inicio, final e incremento.
        //mediante una variable contador se declara en el bucle y vive solo en el bucle

        // FOR incremento +1
        for (int i = 1; i <= 5; i++){
            System.out.println("For: " + i);
        }
        //FOR incremento +3
        for (int i = 1; i <= 9; i+=3){
            System.out.println("For de 3 en 3: " + i);
        }
        //FOR cuenta atras
        for (int i = 7; i >= 0; i--){
            System.out.println("For cuenta atrás: " + i);
        }
        

        //BUCLE CONDICION, No sabemos cuantas veces se repite.
        //Necesitan una condición para salir
        //son infinitos
        //Necesitamos una variable declarada fuera del bucle para controlar la salida del bucle
        int contador = 1;
        while (contador <= 5){
            System.out.println(contador);
            contador ++;
        }


        // FOR: MOSTRAR NUMEROS PARES HASTA 20
        for (int i = 0; i <= 20; i+=2){
            System.out.println(i);
        }
        // MISMO EJERCICIO
        for (int i = 0; i <= 20; i+=2){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

        // WHILE: PEDIR AL USUARIO TEXTOS HASTA QUE ESCRIBA STOP
        //lo comentado no funciona porque Java no compara String con == o !=
        // while (dato != "stop"){
        // Scanner teclado = new Scanner (System.in);
        // String dato = "";
        // System.out.println("Di algo bonito (escribe stop para salir)");
        //dato = teclado.nextLine();
        // while (dato != "stop"){
            //     System.out.println("Di algo bonito (escribe stop para salir)");
            //     dato = teclado.nextLine();
            
            //se comparan objetos y hay que comparar su valor de ese objeto
            //para hacerlo usaremos el metodo equals() de la clase String.
        Scanner teclado = new Scanner (System.in);
        String dato = "";
        while (dato.equals ("stop") == false){
            System.out.println("Di algo bonito (escribe stop para salir)");
            dato = teclado.nextLine();
        }

    }
}
