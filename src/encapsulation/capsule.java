package encapsulation;

public class capsule {

	
	     String name;
	
	public void setname(String name) {
		
		this.name=name;
	}
	
	public String getname() {
		
		return name;
	}
	
	
	public static void main(String[] args) {
		
		capsule z=new capsule();
		z.setname("Amit");
		System.out.println(z.getname());

	}

}
