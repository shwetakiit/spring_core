package kumari.shweta;



public class FactoryMethodBeanInstantiation {
	
    private static final  FactoryMethodBeanInstantiation objBeanInstantiation = new FactoryMethodBeanInstantiation() ;
	private FactoryMethodBeanInstantiation() {};
	
	public static  FactoryMethodBeanInstantiation getInstance() {
	
		return objBeanInstantiation;
	}

	
	public void display() {
		System.out.println("this approach is static factory method instantiation");
	}
}
