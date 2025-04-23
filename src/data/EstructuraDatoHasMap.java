package data;

import java.util.HashMap;
import java.util.Map;

public class EstructuraDatoHasMap {
    
    public void principal(){
        Map<String, Integer> edades = new HashMap<>();
        
        edades.put("Ana", 20 );
        edades.put("Pepito", 10 );
        edades.put("Marcos", 60 );
        
        //remover un valor
        //edades.remove("Ana");
        
        //iterar un HashMap
        for(Map.Entry<String, Integer> item : edades.entrySet()){
            System.out.println(
                    "Nombre: "+
                    item.getKey()+
                    " su edad es: "+
                    item.getValue());
        }
    }
    
}
