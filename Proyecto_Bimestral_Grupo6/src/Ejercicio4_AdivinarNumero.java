/***
 * Se le solicita desarrollar un demo tipo juego, que permita generar un número
 * aleatorio y le rete al usuario que lo adivine. Si no adivina el número, el juego
 * debe sugerirle lo intente nuevamente con pistas (es mayor, menor, es par,
 * impar, es primo, pertenece a la serie de fibonacy, es multiplo de N, etc.), el
 * usuario es quien deberá ir pidiendo repetitivamente que el sistema le muestre o
 * no, más pintas, solo que, si el usuario pide más pistas, el sistema
 * automáticamente le resta un intento y le informa cuantos intentos le quedan. Al
 * finalizar el juego, se debe felicitar al usuario si gana y como, o pedir que lo
 * intente de nuevo.
 */
import java.util.Scanner;
public class Ejercicio4_AdivinarNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //DEFINICION DE VARIABLES.
        int aleatorio = (int) (Math.random() * 100);
        int numero, intentos = 10;
        String pista;
        String reglas = """
                       REGLAS BASICAS!!
                       1) Tienes 10 intentos para adivinar el numero.
                       2) Vas a ir encontrando diferentes pistas conforme te acerques al número correcto.
                       3) Puedes soliciar pistas en cualquier momento, pero se te penalizara restandote intentos.
                       4) Si pides dos o mas pistas seguidas la resta de intentos va a aumentar.
                          Primer pista: Gratis , Segunda pista: -1 intentos, Tercer pista: -2 intentos
                       """;
        //IMPRESION DE LAS REGLAS DEFINIDAS
        System.out.println(reglas);
        //INICIO DEL CICLO WHILE
        while(intentos > 0){
            System.out.println("OJO TIENES " + intentos + " INTENTOS PARA ADIVINAR.");
            System.out.print("ADIVINA UN NUMERO (0-100): ");
            numero = teclado.nextInt();
            teclado.nextLine();
            intentos--;
            //CONDICIONAL EN CASO DE ADIVINAR EL NUMERO O EN CASO DE QUE LOS INTENTOS LLEGUEN A 0.
            if ( aleatorio == numero ){
                    intentos = 0;
                    System.out.println("FELICIDADES GANASTE");
                    System.out.println("INTENTALO DE NUEVO!!!");
                    break;
                } else if (intentos == 0)  {
                     System.out.println("MALA SUERTE. Puedes intentarlo nuevamente.");
                     break;
                    } 
            //CONDICIONALES DE LAS PISTAS.
                System.out.println("AQUI TIENES UNA PISTA: ");
                          if(aleatorio > numero){
                            System.out.println("PISTA: ES MAYOR A " + numero);
                        } else {
                            System.out.println("PISTA: ES MENOR A " + numero);
                        } 
                    System.out.println("¿QUIERES UNA SEGUNDA PISTA?");
                    pista = teclado.nextLine(); 
                        if(pista.equalsIgnoreCase("SI") && intentos > 0) {
                        intentos = intentos - 1;
                            if(aleatorio % 3 == 0){
                                System.out.println("PISTA: El numero es multiplo de 3");
                            }else {
                                System.out.println("PISTA: El numero no es multiplo de 3");
                            }  
                        }
                    System.out.println("¿QUIERES UNA TERCERA PISTA?");
                    pista = teclado.nextLine(); 
                        if(pista.equalsIgnoreCase("SI") && intentos > 0){ 
                            intentos = intentos - 2;
                            System.out.println("INTENTOS RESTANTES: " + intentos);
                            if (aleatorio%2==0){
                                System.out.println("PISTA: EL NUMERO ES PAR");
                            }else{
                                System.out.println("PISTA: EL NUMERO ES IMPAR");
                    } 
                    teclado.nextLine();//SIRVE PARA QUE NO SE IMPRIMAN DOS LINEAS TIPO STRING A LA VEZ
                }               
            }
        }
    }
/***
 * run:
 * REGLAS BASICAS!!
 * 1) Tienes 10 intentos para adivinar el numero.
 * 2) Vas a ir encontrando diferentes pistas conforme te acerques al número correcto.
 * 3) Puedes soliciar pistas en cualquier momento, pero se te penalizara restandote intentos.
 * 4) Si pides dos o mas pistas seguidas la resta de intentos va a aumentar.
 * Primer pista: Gratis , Segunda pista: -1 intentos, Tercer pista: -2 intentos
 * OJO TIENES 10 INTENTOS PARA ADIVINAR.
 * ADIVINA UN NUMERO (0-100): 50
 * AQUI TIENES UNA PISTA: 
 * PISTA: ES MAYOR A 50
 * ¿QUIERES UNA SEGUNDA PISTA?
 * si
 * PISTA: El numero no es multiplo de 3
 * ¿QUIERES UNA TERCERA PISTA?
 * si
 * INTENTOS RESTANTES: 6
 * PISTA: EL NUMERO ES PAR
 * OJO TIENES 6 INTENTOS PARA ADIVINAR.
 * ADIVINA UN NUMERO (0-100): 52
 * FELICIDADES GANASTE
 * INTENTALO DE NUEVO!!!
 * BUILD SUCCESSFUL (total time: 21 seconds.
 */
