import java.util.Scanner;


public class Class06MayorTresNumeros {
    public static void main(String[] args) {
        
        //CALCULAR NÚMERO MAYOR,EL MEDIO Y EL MENOR
        int mayor = 0;
        int medio = 0;
        int menor = 0;

        System.out.println("Introduce el primer número: ");
        Scanner teclado = new Scanner(System.in);
        String dato = teclado.nextLine();
        int n1 = Integer.parseInt(dato);
        
        System.out.println("Introduce el segundo número: ");
        dato = teclado.nextLine();
        int n2 = Integer.parseInt(dato);
        
        System.out.println("Introduce el tercer número: ");
         dato = teclado.nextLine();
         int n3 = Integer.parseInt(dato);

         teclado.close(); // Cierra el scanner
        
        //CALCULA SOLO EL MAYOR:
        // if (n1 > n2 && n1 > n3){
        //     mayor = n1;
        // }
        // else if(n2 > n3){
        //     mayor = n2;
        // }
        //  else{
        //     mayor = n3;
        // }
        // System.out.println("El nuemro mayor es: " + mayor);

        if (n1 > n2 && n1 > n3){
            mayor = n1;
            if (n2 > n3){
                medio = n2;
                menor = n3;
            }
            else {
                medio = n3;
                menor = n2;
            }
        }
        else if (n2 > n1 && n2 > n3){
            mayor = n2;
            if (n1 > n3){
                medio = n1;
                menor = n3;
            }
            else {
                medio = n3;
                menor = n1;
            }
        }
        else {
            mayor = n3;
            if (n1 > n2){
                medio = n1;
                menor = n2;
            }
            else {
                medio = n2;
                menor = n1;
            }
        }

        System.out.println("MAYOR: " + mayor);
        System.out.println("MEDIO: " + medio);
        System.out.println("MENOR: " + menor);
        
        //metodo alternativo :
        //PREGUNTAMOS POR LAS CONDICIONES
        // if (n1 >= n2 && n1 >= n3){
            //    mayor = n1;
        // }else if (n2 >= n1 && n2 >= n3){
                //     mayor = n2;
        //  }else {
            //  mayor = n3;
         // }
        // if (n1 <= n2 && n1 <= n3){
            //  menor = n1;
        // }else if (n2 <= n1 && n2 <= n3){
                 //menor = n2;
        // }else{
                 // menor = n3;
        // }
        //sumamos todos los numeros
        // int suma = n1 + n2 + n3;
        // medio = suma - mayor - menor;
                                
        // System.out.println("MAYOR: " + mayor);
        // System.out.println("MEDIO: " + medio);
        // System.out.println("MENOR: " + menor);
        
    }
}