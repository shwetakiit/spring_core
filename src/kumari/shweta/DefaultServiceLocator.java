package kumari.shweta;

public class DefaultServiceLocator {
	
	private static ClientService clientService = new ClientServiceImp();
	
	public ClientService createClientServiceInstance() {
		return clientService;
	}

}
