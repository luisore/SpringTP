package demo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import packageUno.Auto;
import packageUno.Injected;

public class Factory
{
	public static void main(String[] args) {
        List<Object> lista = new ArrayList<Object>();
        lista.add(new Auto());
        procesar(lista);
    }

    public static void procesar(List<Object> lista) {
    	//Falta chequear que tenga @Component por encima del objeto
        try {
            for (Object o : lista) {
                Field[] campos = o.getClass().getDeclaredFields();
                for (Field campo : campos) {
                    Injected injected = campo.getAnnotation(Injected.class);
                    if (injected != null) {
                        if (injected.count() == 1) {
                        	System.out.println(campo);
                        	/*List<Object> lista2 = new ArrayList<Object>();
                        	lista2.add(o);
                        	procesar(lista2);*/
                        } else if(injected.implementation() == "interface"){
                            System.out.println(injected.implementation());
                        } else if(injected.singleton() == 12){
                        	System.out.println(injected.singleton());
                        }
                    }
                }
            }
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
    }
	
	
	private static Object getObject(Class clase)
	{
		Class object = new Class();
		// TODO Auto-generated method stub
		return object;
	}

	
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.TYPE)
	public @interface Component {
	    
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.TYPE)
	public @interface Injected {
		public int count(); // Que verifique que es una List o un Array
	    public Class implementation(); // Solo sobre interfaces
		public boolean singleton();
	}

}



/*
public class ShapeFactory {
	
	   //use getShape method to get object of type shape 
	   public Shape getShape(String shapeType){
	      if(shapeType == null){
	         return null;
	      }		
	      if(shapeType.equalsIgnoreCase("CIRCLE")){
	         return new Circle();
	         
	      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();
	         
	      } else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }
	      
	      return null;
	   }
	}
*/