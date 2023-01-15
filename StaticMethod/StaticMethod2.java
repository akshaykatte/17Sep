package StaticMethod;

public class StaticMethod2 {
	//static method feom differnt class
	public static void show()
	{
		System.out.println("this is static method feom differnt class ");
	}
// static method from parameter from differnt class
       public static void info(String name,String city)
       {
    	   System.out.println("Name="+name);
    	   System.out.println("City="+city);
    	   
       }
//non static method from different class
       public void sum()
       {
    	   System.out.println("non static method from different class");
       }
	//non static method with parameter from different class
       public void div(int a , int b)
       {
    	  int c=0;
    	  c=a/b;
    	  System.out.println("Division="+c);
       }
}
