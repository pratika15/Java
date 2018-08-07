class Machine {
	
	private String name;
	private int code;
	
	public Machine() {
		
		System.out.println("constructor running");
		 name= "prati";
	}
	
	public Machine(String name) {
		System.out.println(" second constructor running");
		 this.name= name;
	
		
	}
	
	public Machine (String name, int code) {
		
		System.out.println("third constructor");
		this.name= name;
		this.code= code;
	}
}


public class App5 {

	public static void main(String[] args) {
		Machine Machine1 = new Machine();
		
		Machine Machine2 = new Machine("prati");
		Machine Machine3 = new Machine("bhanu", 7);
	}
	}
	 
	
	