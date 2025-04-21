package data;

public class OperadoresLogicos {
    //varialbles
    //Metodos
    public void principal(){
        System.out.println("==========================================");
        System.out.println("Bienvenido al Modulo de Operadores Logicos");
        System.out.println("==========================================");

        boolean esVerdadero = true;
        boolean esFalso = false;
        
        System.out.println("Operador logico (AND) (Y) SIMBOLO=(&&)");
        System.out.println("Verdadero y Verdadero: " + String.valueOf(esVerdadero && esVerdadero));
    }
}
