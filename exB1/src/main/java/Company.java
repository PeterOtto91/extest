public class Company {
	
	private String name;
	private Address adres1;
	
	public Company(String name, Address adres1) {
		super();
		this.name = name;
		this.adres1 = adres1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAdres1() {
		return adres1;
	}

	public void setAdres1(Address adres1) {
		this.adres1 = adres1;
	}
	
	
	
}
