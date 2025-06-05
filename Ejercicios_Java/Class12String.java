import java.nio.channels.Pipe.SourceChannel;

public class Class12String {
    public static void main(String[] args) {
        //METODOS STRING
        String texto = "Desarrollo con Java";
        System.out.println("longitud texto: " + texto.length());
        System.out.println("toLower: " + texto.toLowerCase());
        System.out.println("toUpper: " + texto.toUpperCase());
        //Buscamos letras de diversas formas
        System.out.println("indexOff: " + texto.indexOf("a"));//indica cuantas veces está la a
        //La sobrecarga busca a partir de indice superior
        System.out.println("indexOf: " + texto.indexOf("a", 3));//devuelve el index de la tercera a (si no hay, devuelve -1)
        System.out.println("lastindexOf('a') " + texto.lastIndexOf('a'));
        //La sobrecarga busca a partir de indice inferior
        System.out.println("lastIndexOf('a', 17)" + texto.lastIndexOf("a", 17));//devuelve 16 porque el conteo de index empieza en 0
        //Devuelve una parte de la cadena
        System.out.println("substring(5)" + texto.substring(5));//devuelve texto a partir del index 5
        //Devuelve 
        System.out.println("substring(2,4)" + texto.substring(2, 4));
        //
        System.out.println("statrsWith('D')" + texto.startsWith("D"));//devuelve true or false
        //
        System.out.println("endsrsWith('a')" + texto.endsWith("a"));//devuelve true or false
        //
        System.out.println("charAt(5)" + texto.charAt(5));// devuelve la letra de ese indice


        System.out.println("--------------------------------------------------------");
        System.out.println("--------------------------------------------------------");
        
        System.out.println(texto);
        texto = texto.toUpperCase();
        System.out.println(texto);
    }
}