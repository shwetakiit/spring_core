package kumari.aop.model;



public class Circle {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) { //@AfterReturning("args(name)")  adivice    will not get called becoz exception
		
		this.name = name;
		System.out.println("Circle setter has been called");
	  // throw(new RuntimeException());
	}
	
	public String setReturned(String name) {
		this.name=name;
		System.out.println("Circle setter is called");
		return name;
	}
	

}
