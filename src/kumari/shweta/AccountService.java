package kumari.shweta;

public class AccountService {
	
	
	
	public AccountService() {
		
	}

	private AccountService target;

	public AccountService getTarget() {
		return target;
	}

	public void setTarget(AccountService target) {
		this.target = target;
	}
	
	public void draw() {
		System.out.println("Samle for ref of type parent");
	}
	

}
