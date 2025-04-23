package data;

import java.util.ArrayList;
import java.util.List;

public class EstructuraDatoArrayList {
    
    public void principal(){
        List<String> nombres = new ArrayList<>();
        
        nombres.add("Diego");
        nombres.add("Daniel");
        nombres.add("Juan");
        
//        for(String nombre : nombres){
//            System.out.println(nombre);
//        }
        //imprimir un valor
//        System.out.println(nombres.get(1));
//        System.out.println(nombres.get(2));
//        

        
        nombres.remove(1);
        
//        nombres.clear(); //limpiar
        
        for(int i=0; i <nombres.size();i++){
            System.out.println(nombres.get(i));
        }
        
        
    }
}
