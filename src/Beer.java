
public enum Beer {
	KF("KingFisher"),
	KO("KingOutstanding");

	private final String brand;
	Beer(String brand) {
		this.brand=brand;
	}
	
	public String toString()
	{
		return this.brand;
	}
	static {
		System.out.println("static method get called");
	}

}
