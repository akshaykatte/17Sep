package Practice4;

public class Prog3 extends Prog1 {
	@Override
	public int fourWheeler() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public int auto() {
		// TODO Auto-generated method stub
		return 3;
	}

	public static void main(String[] args) {
		Prog2 a=new Prog2();
		System.out.println(a.fourWheeler());
		System.out.println(a.auto());
		
		Prog3 b=new Prog3();
		System.out.println(b.fourWheeler());
		System.out.println(b.auto());
	

	}

}
