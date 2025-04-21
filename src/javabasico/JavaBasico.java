package javabasico;

import data.OperadoresAritmeticos;
import data.OperadoresLogicos;
import java.util.Scanner;

public class JavaBasico {

    public static void main(String[] args) {
        System.out.println("=============JAVA BASICO===========");
        System.out.println("Diego Lipa");
        System.out.println("===================================");
        System.out.println("================MENU===============");
        System.out.println("1. Operadores Logicos");
        System.out.println("2. Operadores Aritmeticos");
        System.out.println("3. Operadores de Comparacion");
        System.out.println("4. Tipo Datos");
        System.out.println("5. Condicionales");
        System.out.println("6. Bucles");
        System.out.println("7. Excepciones");
        System.out.println("8. Arrays");
        System.out.println("9. Listas");
        System.out.println("10. Mapa de valores");
        
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        System.out.println("la Opcion seleccionada es: " + opcion);
        
        boolean salir = true;
        while(salir){
            
            switch(opcion){
                case 1:
                    OperadoresLogicos ol = new OperadoresLogicos();
                    ol.principal();
                    break;
                case 2:
                    OperadoresAritmeticos oa = new OperadoresAritmeticos();
                    oa.principal();
                    break;
                case 3:
                    
                case 4:
                    //Aqui estoy haciendo cambios
                    
//                ...
                default:
                    System.out.println("Opcion no encontrana, Intente Nuevamnete");
            }
            salir = false;
        }
    }
 
}
