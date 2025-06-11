import java.util.Scanner;

public class Class26MetodoMail {
    public static void main(String[] args) {
        // Pedir mail y valorar si es correcto o no 
        // mediante un metodo que validará el mail
        // indicando si es true o false.
        // En main tendremos la petición al usuario del mail

        Scanner teclado = new Scanner(System.in);
        String mail = teclado.nextLine();

    }

    public static boolean compruebaMail (String email){

        boolean validMail= false;

        if (email.contains("@")==true && email.contains(".")==true && email.length() != 0
        
                || (email.startsWith("@") || email.endsWith("@") )
            
                || (email.indexOf("@") != email.lastIndexOf("@") )
            
                || (email.indexOf(".") > 0)

                ||(email.lastIndexOf("@") > email.lastIndexOf(".") )
              
                || (email.lastIndexOf(".") <= (email.length() - 3) || email.lastIndexOf(".") <=(email.length() - 2) ) 
            ){
                validMail = true;
            }
        return validMail;
    }
}
