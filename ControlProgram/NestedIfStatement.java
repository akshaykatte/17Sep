package ControlProgram;

public class NestedIfStatement {

	public static void main(String[] args) {
		String Username="admin";
		String password="Akshay@4780";
		if(Username =="admin")
		{
			System.out.println("Username is correct,now enter the password");
			if(password =="Akshay@4780")
			{
				System.out.println("Login succesful");
			}
			else
			{ 
				System.out.println("incorrect passwrd is entered");
			}
			
		}
		else
		{
			System.out.println("Username is incorrect");
		}


	}

}
