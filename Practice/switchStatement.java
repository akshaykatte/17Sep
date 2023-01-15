package Practice;

public class switchStatement {

	public static void main(String[] args) {
		String day ="sunday";
		
		 
		switch(day)
		{ 
		case"monday":
			System.out.println("Today is  monday");
			break;
		case"tuesday":
			System.out.println("Today is tuesday");
			break;
		case"wednesday":
			System.out.println("Today is wednesday");
			break;
		case"thurday":
			System.out.println("Today is thurday");
			break;
		case "friday":
			System.out.println("Today is friday");
			default:
				System.out.println("wow this is weekend");
		}

	}

}
