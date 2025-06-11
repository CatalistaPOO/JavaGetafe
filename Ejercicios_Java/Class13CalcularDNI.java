import java.util.Scanner;

public class Class13CalcularDNI {
    public static void main(String[] args) {
        //         CALCULAR LA LETRA DEL D.N.I

        // Realizar una aplicación para conocer la letra del 
        // Documento Nacional de Identidad a través del número de DNI. 
        // La fórmula para calcular la letra del número del 
        // DNI se halla de la siguiente manera:
        // Se calcula el valor de la siguiente resta 
        // ( nº DNI - (Ent(nº DNI / 23) * 23))
        // , tal que Ent es la función parte entera de un número.
        // Se mira la equivalencia en la siguiente tabla:
        // 0=T, 1=R, 2=W, 3=A, 4=G, 5=M, 6=Y, 7=F, 8=P, 9=D,
        // 10=X, 11=B, 12=N, 13=J, 14=Z, 15=S, 16=Q, 17=V, 18=H, 19=L,
        // 20=C ,21=K 22=E 23=T

        Scanner teclado;
        String dato;
        int numeroDni;
        String letrasDni;
        int opcion;
        int resultado;
     
        char letra;

        teclado = new Scanner(System.in);
        System.out.println("Seleccione una opción: ");
        System.out.println("1·Comprobar NIF ");
        System.out.println("2· Averiguar letra NIF");
        dato = teclado.nextLine();
        opcion= Integer.parseInt(dato);
        letrasDni = "TRWAGMYFPDXBNJZSQVHLCKET";
        
        if (opcion == 1){
            System.out.println("Introduzca su DNI (12345678X)");
            String dni = teclado.nextLine();
            char letraDni = dni.charAt(dni.length() - 1);
            String temp = dni.substring(0,dni.length() - 1);
            numeroDni = Integer.parseInt(temp);
            resultado = (numeroDni - (numeroDni /23) * 23);
            letra = letrasDni.charAt (resultado);
            if (letraDni == letra){
                System.out.println("Su DNI es correcto");
            }
            else{
                System.out.println(" Su DNI es incorrecto, su letra es: " + letra);
            }
        }
        else{
            System.out.println("Introduzca su DNI");
            dato = teclado.nextLine();
            numeroDni = Integer.parseInt(dato);
            resultado = (numeroDni - (numeroDni /23) * 23);
            letra = letrasDni.charAt (resultado);
            System.out.println("su letra del DNI es " + letra);
        }

        teclado.close(); // Cierra el scanner
    }
}