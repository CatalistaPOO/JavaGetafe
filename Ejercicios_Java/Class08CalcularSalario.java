import java.util.Scanner;

public class Class08CalcularSalario {
    public static void main(String[] args) {
        
        // Realizar una aplicación que obtenga el salario neto de los empleados de una empresa
        // teniendo en cuenta el número de horas trabajadas, el importe a pagar por hora y el lugar
        // al que ha sido destinado el trabajador (establecido en Km).
        // Cada hora extra se pagará 2€ más que las normales,
        
        Scanner teclado;
        String dato;
        int horasTrabajadas = 0;
        int horasExtra = 0;
        String dieta;
        int salario;
        int retencion = 0;
        int IVA = 16;
        int precioBase = 2;
        int precioExtra = 4;
        
        // (la hora extra comienza a computarse a partir de la 36 hora semanal trabajada)
        System.out.println("Horas trabajadas en la semana: ");
        teclado = new Scanner(System.in);
        dato = teclado.nextLine();
        horasTrabajadas = Integer.parseInt(dato);
        
        if (horasTrabajadas > 36){
            horasExtra = horasTrabajadas - 36;
        }

        salario = (36 * precioBase) + (horasExtra * precioExtra);


        // Sobre el salario base anterior, si el destino del empleado está:
        // Entre 101 Km y 900Km: La dieta será “NACIONAL”
        // Por encima de 900Km: Dieta “INTERNACIONAL”
        // Por debajo de 101 Km  Dieta “PROVINCIAL”
        System.out.println("Kilometros hasta su destino de trabajo: ");
        teclado = new Scanner(System.in);
        dato = teclado.nextLine();
        int destino = Integer.parseInt(dato);

        if (destino > 101 || destino < 900){
            dieta = "NACIONAL";
        }
        else if (destino > 900){
            dieta = "INTERNACIONAL";
        }
        else{
            dieta = "PROVINCIAL";
        }

        // Sobre el precio final obtenido del salario:
        // Cantidades menores o iguales a 250 € no soportan retención 0%
        // Cantidades por encima de 250 € y menores o iguales a 500 € la retención es del 20%
        // Cantidades por encima de 500 € la retención es del 50%
        if (salario >= 250 && salario <= 500){
            retencion = 20;
        }
        else if (salario > 500){
            retencion = 50;
        }
        // Aplicaremos el IVA (16%) al salario bruto y se lo restaremos para conseguir el salario neto del trabajador.
        
        // Horas trabajadas: 40
        // Precio Hora: 20
        // Horas extras: 4
        // PrecioBase: 36 * 20 
        // PrecioExtra: 4 * 22
      
        
        
        
        // Al final debemos mostrar el siguiente informe:
        
        // INTRODUZCA HORAS SEMANALES      
        // 51                              
        // INTRODUZCA IMPORTE HORA:        
        // 24                              
        // INTRODUZCA KILOMETROS:          
        // 269                             
        
        // ---------------------------------------------------
        // HORAS TRABAJADAS:           51
        // HORAS EXTRAS:                    15
        // IMPORTE DE LA HORA:         24
        // DISTANCIA EN KM:                269
        // DESTINO:              	NACIONAL
        // RETENCION:           	       50%
        // SALARIO BASE:           	      864.00
        // SALARIO HORAS EXTRA:     540.00
        // SALARIO BRUTO:                  1404.00
        // IVA (16%):                                224.64
        // ---------------------------------------------------
        // SALARIO TOTAL:         1179.36
        // ---------------------------------------------------
        // FIN DE PROGRAMA

          System.out.println(         
        " HORAS TRABAJADAS:    " + horasTrabajadas + "\n" + 
        " HORAS EXTRAS:        " + horasExtra + "\n" + 
        " IMPORTE DE LA HORA:  " + precioBase + "\n"+ 
        " DISTANCIA EN KM:     " + destino + "\n"+ 
        " DESTINO:             " + dieta + "\n"+ 
        " RETENCION:           " + retencion + "\n" + 
        " SALARIO BASE:        " + 2 * 36 + "\n"+ 
        " SALARIO HORAS EXT:   " + horasExtra * precioExtra + "\n"+ 
        " SALARIO BRUTO:       " + salario + "\n"+ 
        " IVA (" + IVA + "%):           " + (salario - IVA) + "\n" + 
        " ------------------------------------\n" + 
        " SALARIO TOTAL: "
        );
        
    }
}
