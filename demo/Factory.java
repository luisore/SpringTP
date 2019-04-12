package demo;
import java.lang.reflect.Method;

public class Factory
{
	public static void main() 
	{ 
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