import java.util.Scanner;

public  class Class17NumeroIsbn{
    public static void main(String[] args) {
        // Debemos comprobar que el número introducido tiene 10 caracteres.
        // EJEMPLO DE NUMERO ISBN QUE ESTÁ BIEN:
        // 8441513929

        // 1.- Se descompone la cadena y se multiplica cada número por la posición que ocupa en la cadena:
        //  8 * 1
        //  4 * 2
        //  4 * 3
        //  1 * 4
        //  5 * 5
        //  .
        //  .
        //  .
        //  9 * 10

        //2.- La suma de todas estas multiplicaciones se divide entre 11,
        //  y si el resto es cero, el número ISBN es correcto.
        // INTRODUZCA EL NUMERO ISBN A VALIDAR (10 CIFRAS)    
        // 1234567891                                         
        // LA LONGITUD DE CARACTERES ES 10                    
        // COMPROBANDO ISBN 1234567891                        
        // NUMERO ISBN 1234567891 NO CORRECTO                 
        // FIN DE PROGRAMA 

        Scanner teclado = new Scanner(System.in);
        String sIsbn;
        int nIsbn;

        System.out.println("Escribe numero isbn (10 cifras)");
        sIsbn = teclado.nextLine();
        
        while (sIsbn.length() != 10){
            System.out.println("El ISBN debe tener 10 cifras");
            sIsbn = teclado.nextLine();
        } 
        int suma = 0;
        for (int i = 0; i < sIsbn.length();i++){
            char letra = sIsbn.charAt(i);
            String aux = String.valueOf(letra);
            int numero = Integer.parseInt(aux);
            suma += numero * (i+1);
            // suma += Integer.parseInt((String.valueOf(sIsbn.charAt(i))) )* (i+1);
        }
        if (suma % 11 == 0){
            System.out.println("El ISBN es correcto");
        } 
        else{
            System.out.println("ISBN NO VALIDO");
        }
        System.out.println("FIN DE PROGRAMA");
    }
}