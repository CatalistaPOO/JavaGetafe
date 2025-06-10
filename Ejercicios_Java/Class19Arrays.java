public class Class19Arrays {
    public static void main(String[] args) {
        //creamos array con 3 elementos
        String[] nombres = new String[3];

        //visualizamos su longitud y definimos sus elementos
        System.out.println("longitud del array: " + nombres.length);
        nombres[0] = "Lucía";
        nombres[1] = "Adrián";
        nombres[2] = "Diana";

        // Recorremos el array
        for (int i = 0 ;i <nombres.length; i++){
            System.out.println("Nombres: " + i + "= " + nombres[i]);
        }
        
        //creamos un array y lo inicializamos para recorrerlo después
        int[] numeros = {5,4,3,2,1};
        for (int i = 0 ;i <numeros.length; i++){
            System.out.println("Numeros: " + i + "= " + numeros[i]);
        }
    }
}