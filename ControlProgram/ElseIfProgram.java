package ControlProgram;

public class ElseIfProgram {

	public static void main(String[] args) {
		// ElseIfProgram
		int mark = 101;
				if(mark>=40 && mark<60)
				{
					System.out.println("Student is pass in second class");
				}
				else if (mark>=60 && mark<75)
				{
					System.out.println("Student is pass in first class");
				}
				else if (mark>=75 && mark<90)
				{
					System.out.println("Student is pass in distinction");
				}
				else if (mark>=90 && mark<=100)
				{
					System.out.println("Student pass in merit");
				}
				else if(mark>100)
				{
					System.out.println("invalid input");
				}
				else
				{ 
					System.out.println("Student is fail");
					
				}
					
					
					

	}

}
