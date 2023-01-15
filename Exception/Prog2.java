package Exception;

public class Prog2 {

	public static void main(String[] args) throws InterruptedException {
          int arr[]= {1,2,3};
          
          Thread.sleep(5000);
          System.out.println(arr[0]);
          Thread.sleep(5000);
          System.out.println(arr[1]);
          Thread.sleep(5000);
          System.out.println(arr[2]);
	}

}
