import java.util.Scanner;

public class Class04PositivoNegativo {
    public static void main(String[] args) {
        //CALCULAR SI EL NÚMERO ES POSITIVO O NEGATIVO

        //Crear objeto
        Scanner teclado = new Scanner (System.in);

        //solicitar datos y usar objeto para capturar entrada teclado,
        //1º como string y conversion despues a int
        String dato = teclado.nextLine();
        int n = Integer.parseInt(dato);

        if (n > 0){
            System.out.println("El numero es POSITIVO");
        }
        else if (n == 0){
            System.out.println("El numero es 0");
        }
       else{
           System.out.println("El numero es NEGATIVO");
       }
        
    }
}