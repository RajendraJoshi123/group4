package polymorphi;

public class overloading {

	
	public void s1() {
		System.out.println("rajendra");
	}
	
	public void s1(int a) {
		System.out.println("rahul");
	}
	
	public void s1(String a) {
		System.out.println("rajat");
	}
	public static void main(String[] args) {
		
		overloading z=new overloading();
		z.s1();
		z.s1(2);
		z.s1("hi");
		z.s1('s');

	}

}
