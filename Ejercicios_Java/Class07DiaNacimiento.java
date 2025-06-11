import java.util.Scanner;

public class Class07DiaNacimiento {
   public static void main(String[] args) {
       //CALCULAR DIA DE NACIMIENTO DE LA SEMANA
        // Pedir una fecha al usuario para calcular el día de la semana que nació.
        // Tenemos que tener la tabla de días de la semana para la correspondencia comenzando en:
        //  sábado 0
        //  domingo 1
        //  lunes 2
        //  martes 3
        //  miercoles 4
        //  jueves 5
        //  viernes 6

         int semana;

        Scanner teclado = new Scanner (System.in);

        System.out.println("Introduce año en numeros (últimos 2 números): ");
        String dato = teclado.nextLine();
        int year = Integer.parseInt(dato);

        System.out.println("Introduce mes en números (2 números): ");
        dato = teclado.nextLine();
        int mes = Integer.parseInt(dato);
        
        System.out.println("Introduce día en números (2 números): ");
        dato = teclado.nextLine();
        int dia = Integer.parseInt(dato);

        teclado.close(); // Cierra el scanner

        // Debemos pedir el día, el número de mes y el año que el usuario haya nacido.
        // A partir de esto datos hay que calcular lo siguiente para averiguar el día de la semana de nacimiento:
        // Ejemplo --> 15/06/1997
        // Hay que tener en cuenta el mes para realizar el cálculo, si el mes es Enero, el Mes será 13 y restaremos uno al año. 
        // Si el Mes es Febrero, el Mes será 14 y restaremos uno al año.

        if (mes == 01){
            mes = 13;
            year -= 1;
        }
        else if (mes == 02){
            mes = 14;
            year -= 1;
        }

        // Para poder calcular las el número final de la semana debemos seguir los siguientes pasos:

       
        // Multiplicar el Mes más 1 por 3 y dividirlo entre 5
        //  ((6 + 1) * 3) / 5  --> 4
        int operacion1 = ((mes + 1) * 3) / 5;
        // Dividir el año entre 4
        //   1997 / 4  --> 499
        int operacion2 = year / 4;
        // Dividir el año entre 100
        //   1997 / 100 -->19
        int operacion3 = year / 100;
        // Dividir el año entre 400
        //   1997 / 400 --> 4
        int operacion4 = year / 400;
        // Sumar el dia, el doble del mes, el año, el resultado de la operación 1,
        //  el resultado de la operación 2, menos el resultado de la operación 3 más la operación 4 más 2.
        //   15 + (6 * 2) + 1997 + 4 + 499 - 19 + 4 + 2 --> 2514
        int operacion5 = dia + (mes * 2) + year + operacion1 + operacion2 - operacion3 + operacion4 + 2;
        // Dividir el resultado anterior entre 7.
        //   2514 / 7 --> 359
        int operacion6 = operacion5 / 7;
        // Restar el número del paso 5 con el número del paso 6 por 7.
        //  	  2514 – (359 * 7) --> 1
        int resultado = operacion5 - (operacion6 * 7);
        // Miramos la tabla y vemos que el número 1 corresponde a Domingo
        if (resultado == 0)
        System.out.println("SABADO");
        else if (resultado == 1)
        System.out.println("DOMINGO");
        else if (resultado == 2)
        System.out.println("LUNES");
        else if (resultado == 3)
        System.out.println("MARTES");
        else if (resultado == 4)
        System.out.println("MIERCOLES");
        else if (resultado == 5)
        System.out.println("JUEVES");
        else if (resultado == 6)
        System.out.println("VIERNES");
        else if (resultado > 6  || resultado < 0){
            System.out.println("Hubo un error");
        }
   }

}
