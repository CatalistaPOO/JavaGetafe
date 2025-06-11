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

    public static boolean (String email){
        boolean validMail= false;
        if (email.contains("@")==true && email.contains(".")==true && email.length() != 0 
                || (email.startsWith("@") || email.endsWith("@"))){
            
                || (email.indexOf("@") != email.lastIndexOf("@") )
            else if(email.indexOf(".") > 0){
                System.out.println("ERROR: no hay dominio ");
            }
            else if(email.lastIndexOf("@") > email.lastIndexOf(".")){
                System.out.println("ERROR: tu dominio (.) empieza antes de tu email (@)");
            }
            else if(email.lastIndexOf(".") <= (email.length() - 3)|| email.lastIndexOf(".") <=(email.length() - 2)){
                System.out.println("ERROR: Dominio demasiado largo");
            }
            else{
                System.out.println("E-mail válido");
            }
        }
        else{
            System.out.println("Tu mail no tiene @  o  . ");
        }
        return istrue;
    }
}
