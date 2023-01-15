package ThisMethod;

public class Prog1 {

int b=45;
        public Prog1(int a)
 {
        	this();
	System.out.println("this is a non static method "+a);
 }
int a=12;
        public Prog1()
        {
        	this(100000.12);
        	System.out.println("hi");
        	System.out.println("A="+a);
        }
        public Prog1(double a)
        {
        	System.out.println("salary of employe is="+a);
        }
}
