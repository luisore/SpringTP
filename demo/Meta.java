package demo;
import java.lang.reflect.Method;

class Meta
{
	@Injected(count=4)
	public static void myMeth(String str, int i)
	{
		Meta ob=new Meta();

		try
		{
			Class c=ob.getClass();

			Method m=c.getMethod("myMeth",String.class,int.class);

			Injected anno=m.getAnnotation(Injected.class);

			System.out.println("count: "+anno.count());
		}
		catch(NoSuchMethodException exc)
		{
			System.out.println("Method Not Found.");
		}
	}

	public static void main(String args[])
	{
		myMeth("test",10);
	}
}