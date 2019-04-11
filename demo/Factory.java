package demo;

public class Factory
{
	public static void main() 
	{ 
	   //Auto a = Factory.getObject(Auto.class); 
	}

	private static Object getObject(Class clase)
	{
		// TODO Auto-generated method stub
		return null;
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