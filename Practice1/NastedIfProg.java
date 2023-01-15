package Practice1;

public class NastedIfProg {

	public static void main(String[] args) {
		String Username = "admin";
		String Password = "Amar@123";
		if(Username == "admin")
		{
			System.out.println("User name is correct, now enter the password");
			if(Password == "Amar@123")
			{
				System.out.println("login successful");
			}
			else
			{
				System.out.println("incorrect password is entered");
			}
		}
		else
		{
			System.out.println("user name is incorrect");
		}

	}

}
