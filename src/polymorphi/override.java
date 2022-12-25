package polymorphi;

class sumit{
	
	public void j2(String b) {
		System.out.println("good");
	}
}


public class override extends sumit{

	public void j2(String v) {
		System.out.println("morning");
	}
	

	public static void main(String[] args) {
		
		override z=new override();
		z.j2("kk");

	}

}
