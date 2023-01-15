package String;

public class StrProg {

	public static void main(String[] args) {
         String str=" My Name Is Akshay Katte";
         String str1="my name is akshay katte";
         
         
         
         System.out.println(str.length());// print length
         System.out.println(str.toUpperCase());//all letter became capital in this case
         System.out.println(str.toLowerCase());//all letter became small in this case
         System.out.println(str.equals(str1));// check the str and str1 is edual or not case sensitive
         System.out.println(str.equalsIgnoreCase(str1));//check the str and str1 is edual or not ignore case sensitive
		System.out.println(str.contains("ay"));
		System.out.println(str.isEmpty());
		System.out.println(str.charAt(21));
		System.out.println(str.indexOf("e"));
		System.out.println(str.lastIndexOf("e"));
		System.out.println(str.startsWith("My "));
		System.out.println(str.endsWith("Katte"));
		System.out.println(str.substring(3));
		System.out.println(str.substring(5, 20));
		System.out.println(str.concat(str1));
		System.out.println(str.replace("Akshay", "Ak"));
		System.out.println(str.trim());
	}

}
