import java.util.Scanner;

public class Class24Metodos {
    public static void main(String[] args) {
        //llamamos al metodo VOID
        metodoAccion();

        //Llamamos al metodo RETURN
        sumarNumeros(3, 7);
        System.out.println(sumarNumeros(4, 1));

        //LLamada a metodo String
        System.out.println(saludo("Fer"));
    }   
    
    //creamos método VOID fuera del método main, siempre dentro de la clase
    public static void metodoAccion(){
        System.out.println("Soy un metodo de acciones");
    }

    //creamos método RETURN
    public static Integer sumarNumeros(int n1, int n2){
        int suma = n1 + n2;
        return suma;
    }

    //RETURN TIPO STRING
    public static String saludo(String nombre){
       return "Como estás " + nombre + "?";
    }
}

