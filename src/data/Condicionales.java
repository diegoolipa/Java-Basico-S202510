package data;

import java.util.Scanner;

public class Condicionales {
    
    
    public void principal(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una edad: ");
        int edad = scanner.nextInt();
        
        if(edad >= 18 ){
            System.out.println("Eres Mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
        
    }
    
    public void validaInformacionPersona(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una edad: ");
        int edad = scanner.nextInt();
        
        if(edad < 5){
            System.out.println("Eres un(a) niño(a)");
        }else if(edad <= 12){
            System.out.println("Eres un Adolecente");
        }else if(edad <= 20){
            System.out.println("Eres un Joven");
        }else if(edad <=60){
            System.out.println("Eres un Adulto");
        }else{
            System.out.println("Eres un Ancino");
        }
    }
}
