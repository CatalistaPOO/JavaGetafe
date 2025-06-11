import java.util.Scanner;

public class Class26MetodoMail {
    public static void main(String[] args) {
        // Pedir mail y valorar si es correcto o no 
        // mediante un metodo que validará el mail
        // indicando si es true o false.
        // En main tendremos la petición al usuario del mail

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce email a validar: ");
        String correo = teclado.nextLine();
        teclado.close();

        System.out.println(compruebaMail(correo));
    }

    public static String compruebaMail (String testCorreo){

        boolean validMail= false;
        String respuesta = "";

        if ((testCorreo.contains("@")==true && testCorreo.contains(".")==true && testCorreo.length() >= 0) == true
        
                && ((testCorreo.startsWith("@")  || testCorreo.endsWith("@")) == false )
            
                && ((testCorreo.indexOf("@") != testCorreo.lastIndexOf("@")) == false )
            
                && ((testCorreo.indexOf(".") > 0 ) == true)

                && ((testCorreo.lastIndexOf("@") > testCorreo.lastIndexOf(".") == false) )
              
                && ((testCorreo.lastIndexOf(".") <= (testCorreo.length() - 3) || testCorreo.lastIndexOf(".") <=(testCorreo.length() - 2) == true) ) 
            ){
                validMail = true;
         }

        if (validMail == true){
             respuesta = testCorreo + " es válido";
        }
        else{
            respuesta = testCorreo + " NO válido";
        }
        return respuesta;
    }
}
