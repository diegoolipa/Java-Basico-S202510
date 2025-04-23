package javabasico;

import data.Ciclos;
import data.Condicionales;
import data.EstructuraDatoArrayList;
import data.EstructuraDatoArrays;
import data.EstructuraDatoHasMap;
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
        System.out.println("3. Tarea Operadores de Comparacion (>,<,>=,<=,==,!=)");
        System.out.println("4. Tarea Tipo Datos (6 tipos = String, int, Integer...)");
        System.out.println("5. Tarea Condicionales (switch)");
        System.out.println("6. Tarea Bucles o Ciclos (forEach, while)");
        System.out.println("7. Excepciones");
        System.out.println("8. Arrays");
        System.out.println("9. Listas");
        System.out.println("10. Mapa de valores");
        
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese una opcion: ");
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
                        //Operadores de Comparación
                        break;
                    case 4:
                        //Tipos de Datos
                        break;
                    case 5:
                        Condicionales c = new Condicionales();
                        //c.principal();
                        c.validaInformacionPersona();
                        break;
                    case 6:
                        Ciclos ciclos = new Ciclos();
                        ciclos.cicloFor();
                        break;
                    case 7:
                        //Ejemplo realizado en la clase principal.
                   
                    case 8:
                        EstructuraDatoArrays arrays = new EstructuraDatoArrays();
                        arrays.principal();
                        break;
                    case 9:
                        EstructuraDatoArrayList list = new EstructuraDatoArrayList();
                        list.principal();
                        break;
                    case 10:
                        EstructuraDatoHasMap hasMap = new EstructuraDatoHasMap();
                        hasMap.principal();
                        break;
    //                ...
                    default:
                        System.out.println("Opcion no encontrana, Intente Nuevamnete");
                }
                salir = false;
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un Error!: porfavor ingrese un número válido " + e.getMessage());
        }
    }
}
