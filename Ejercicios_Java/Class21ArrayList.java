import java.util.ArrayList;

public class Class21ArrayList {

    public static void main(String[] args) {
        //esta declaracion detecta en compilacion error
        //  si hay diferente tipado en los elementos
        //Las colecciones solo permiten Clases en su declaración (por ej:Integer y no int)
        ArrayList<String> coleccion = new ArrayList<String>();

        // Añadios 4 elementos a colección y uno repetido
        coleccion.add("Elemento 1");
        coleccion.add("Elemento 2");
        coleccion.add("Elemento 3");
        coleccion.add("Elemento 1");

        System.out.println("Número de elementos: " + coleccion.size());
        
        // MODIFICO elemento
        coleccion.set(1, "Nuevo Elemento");
        //INSERTO elemento en la posición 1
        coleccion.add(1, "Nuevo Elemento 2");
        System.out.println("Insertado nuevo elemento");
        //ELIMINO elemento (el primero que encuentra si se llaman igual o es el mismo)
        coleccion.remove("Elemento 1");
        System.out.println("Se ha eliminado el Elemento 1");
        //ELIMINAR por index permite mayor precisión
        coleccion.remove(4);
        System.out.println("Se ha eliminado el elemento del index 4");
        //BUSCAR en la colección por index
        System.out.println("Elemento 1 en coleccion: " + coleccion.indexOf("Elemento 1"));
        // BUSCAR desde el final un elemento
        System.out.println("El último elemento en coleccion de tipo Elemento1 es: " + coleccion.indexOf("Elemento 1"));


        for(int i = 0;i < coleccion.size();i++){
            // recuperamos cada elemento del arraylist
            String elemento = coleccion.get(i);
            System.out.println(elemento);
        }

        //sintaxis de BUCLES POR REFERENCIA
        // for (tipo variable: conjunto)
        //este tipo de bucles es tipo SOLO LECTURA
        //y NO PERMITEN MODIFICACION de elementos ni tamaño del arraylist en su ejecución
        for (String elemento : coleccion){
            System.out.println(elemento);
        }

        //ELIMINAR toda la colección
        coleccion.clear();
        System.out.println("Numero de elementos: " + coleccion.size());
    }
}

