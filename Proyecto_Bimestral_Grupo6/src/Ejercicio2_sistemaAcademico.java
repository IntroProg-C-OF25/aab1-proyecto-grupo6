/***
 * La UTPL, le contrata para realizar una aplicación pequeña que permita la gestión de calificaciones de los estudiantes en una materia. 
 * Del Estudiante se registra su: nombre, cédula y la materia a cruzar. (Auto genere estos datos con la función ALEATORIO/RAMDOM)
 * Se debe verificar la aprobación de una materia dadas tres calificaciones: ACD (3.5/10), APE (3.5/10) y AA (3/10). 
 * Se aprueba si la sumatoria es de al menos 70%, si cumple con este requisito, se considera que ha aprobado, caso 
 * contrario informar al estudiante que deberá rendir un examen de recuperación sobre 3.5/10 pts. agregado al 60% 
 * acumulado de los componentes ACD, APE y AA.
 * Ahora, debe implementar los siguientes requisitos en su programa:1.  El programa debe permitir al usuario ingresar los datos de un estudiante, 
 * incluyendo su nombre y cédula. (Nota: realizarlo por medio de simulación – random/aleatorio en el main())
 * El programa debe permitir auto generar simulación de los datos de una materia, incluyendo su nombre y las calificaciones 
 * del estudiante en las categorías ACD, APE y AA.
 * El programa debe verificar si un estudiante ha aprobado la materia. Para ello, se deben evaluar las calificaciones del estudiante 
 * en las tres categorías (ACD, APE y AA). 
 * Al finalizar, el programa debe mostrar las estadísticas/porcentajes de aprobación y/o reprobación de la materia de un X curso. 
 */
import java.util.Random;
public class Ejercicio2_sistemaAcademico {
    public static void main(String[] args) {
        Random random = new Random();
        //DECLARACION DE LAS VARIABLES TIPO STRING.
        String nombrecompl, cedula, acreditado;
        String[] nombres = {"Pablo", "Mario", "Sonia", "Diana", "Lucia"};
        String[] apellidos = {"Fernandez", "Rodriguez", "Gonzalez", "Martinez", "Sarmiento"};
        String[] materias = {"COMPUTACION Y SOCIEDAD", "ESTRUCTURAS DISCRETAS", "FUNDAMENTOS COMPUTACIONALES", "FUNDAMENTOS MATEMATICOS", "INTRODUCCION A PROGRAMACION"};
        String nombreAleatorio = nombres[random.nextInt(nombres.length)];
        String apellidoAleatorio = apellidos[random.nextInt(apellidos.length)];
        nombrecompl = nombreAleatorio + " " + apellidoAleatorio;
        String materiaaleatoria = materias[random.nextInt(materias.length)];
        //DECLARACION DE LAS VARIABLES TIPO DOUBLE.
        double bim1, bim2, total, aaprom;
        double acdaleatorio = (double) (Math.random() * 3.5);
        double apealeatorio = (double) (Math.random() * 3.5);
        double acd2aleatorio = (double) (Math.random() * 3.5);
        double ape2aleatorio = (double) (Math.random() * 3.5);
        //DECLARACION DE LAS VARIABLES TIPO INT
        int aleatorio = (int) (Math.random() * 1000000);
        cedula = ("110" + aleatorio);
        int aaAleatorio = (int) (Math.random() * 3);
        int aa2Aleatorio = (int) (Math.random() * 3);
        //CALCULO DE PROMEDIOS
        bim1 = (acdaleatorio + apealeatorio + aaAleatorio);
        bim2 = (acd2aleatorio + ape2aleatorio + aa2Aleatorio);
        total = bim1 / bim2;
        aaprom = ((aaAleatorio + aa2Aleatorio) / 2);
        //CONDICIONIAL PARA CONOCER SI SE ACREDITA O NO
        if (total >= 7 && total <= 10) {
            acreditado = "ACREDITADO";
        } else if (total <= 6.9 && total >= 0) {
            int recuperacionaleatorio = (int) (Math.random() * 7);
            total = aaprom + recuperacionaleatorio;
            if (total >= 6.5) {
                acreditado = "ACREDITADO";
            } else {
                acreditado = "NO ACREDITADO";
            }
            //ESTADISTICAS DEL ESTUDIANTE
            System.out.printf("|%s\t\t|%s\t\t|%s\t     |%s\t|%s\t|%s\t|%s\t|%s\t|%s\t|%s\t|%s\t|%s\t|%s\t\n", "NOMBRE", "MATERIA", "C.I", "ACD1", "APE1", "AA1", "ACD2", "APE2", "AA2", "TOTAL", "AAPROM", "RECUPERACION", "ACREDITADO O NO ACREDITADO");
            System.out.printf("|%s |%s\t|%s\t|%.2f\t|%.2f\t|%d\t|%.2f\t|%.2f\t|%d\t|%.2f\t|%.2f\t|%d\t|%s\t\n", nombrecompl, materiaaleatoria, cedula, acdaleatorio, apealeatorio, aaAleatorio, acd2aleatorio, ape2aleatorio, aa2Aleatorio, total, aaprom, recuperacionaleatorio, acreditado);
        }
    }
}
/***
 * run:
 *|NOMBRE         |MATERIA		        |C.I	        |ACD1	|APE1	|AA1	|ACD2	|APE2	|AA2	|TOTAL	|AAPROM	|RECUPERACION	|ACREDITADO O NO ACREDITADO	
 *|Lucia Martinez |COMPUTACION Y SOCIEDAD	|110273174	|1.83	|2.85	|0	|1.54	|0.84	|2	|2.00	|1.00	|1	        |NO ACREDITADO	
 * BUILD SUCCESSFUL (total time: 0 seconds)
 */
