package demo;

import java.util.ArrayList;
import java.util.List;

@Component 
public class Auto 
{ 
   @Injected 
   private Motor motor; 
    
   @Injected(count=4) 
   private Rueda[] ruedas; 
    
   @Injected(count=4) 
   private List<Butaca> butacas; 
    
   //@Injected(implementation=AutostereoSonyImple.class) 
   private Autostereo autostereo; 
 
   // ...  
} 
