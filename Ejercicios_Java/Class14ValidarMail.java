import java.util.Scanner;

public class Class14ValidarMail {
    public static void main(String[] args) {
        //VALIDAR MAIL
        // Indicar cada error del mail
        // NO PODEMOS USAR BUCLES, SOLO IF
        // comprobamos los siguientes elementos:
        // 1· Que exista una @
        // 2· Que la @ no este al principio ni al final
        // 3· Solamente una @
        // 4 ·Exista un punto
        // Exista un punto despues de la @
        // dominio de 2 a 3 caracteres (.com, .es)

        Scanner teclado = new Scanner(System.in);

        System.out.println("escriba su e-mail: ");
        String email = teclado.nextLine();

        teclado.close(); // Cierra el scanner

        if (email.contains("@")==true && email.contains(".")==true && email.length() != 0){
            if (email.startsWith("@") || email.endsWith("@")){
                System.out.println("ERROR: @ no está bien posicionada");
            }
            else if (email.indexOf("@") != email.lastIndexOf("@") ){
                System.out.println("ERROR: varias @ en tu email ");
            }
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
        System.out.println("FIN DE PROGRAMA");
    }
}