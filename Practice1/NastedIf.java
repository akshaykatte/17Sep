package Practice1;

public class NastedIf {
	public static void main(String[]args) {
		String username ="admin";
		String password ="Admin@123";
		if(username =="admin")
		{
			System.out.println("username is correct,now enter the password");
			if(password =="Admin@123")
			{
				System.out.println("login successful");
			}
			else
			{
				System.out.println("incorrect password");
			}
		}
		else
		{
			System.out.println("username is incorrect");
		}
			
	}

}
