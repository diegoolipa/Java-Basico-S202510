package data;

public class EstructuraDatoArrays {

    public void principal() {
        int edad = 10;
        String nombre = "Pepito";

        int[] edades = {10, 20, 33, 47, 50};
        String[] nombres = {"Pepe", "Maria", "Miguel", "50"};
        Object[] nombresEdades = {"Juan", "Maria", 50, true, 12.29, "Diego"};

        edades[2] = 23;
        //Imprimir un valor
        System.out.println(edades[0]);

        //contar las catidad de valores que tiene un array
        System.out.println("Cantidad: "+nombresEdades.length);
        
        
        for(int i = 0; i<= nombresEdades.length-1 ;i++){
            
            if("Diego".equals(nombresEdades[i])){
                System.out.println("aqui esta mi nombre: "+nombresEdades[i]);
            }
            System.out.println(nombresEdades[i]);
        }

    }
}
