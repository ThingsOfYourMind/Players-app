class Player{
	private String name;
	private String number;
	private String customer;
	private String custPhoneNumber;
	private String custEmail;
	private boolean bought = false;
	private Score 

	public Player(String name, String number)
	this.name = name;
	this.number = number;
	this.customer = "Available";
	this.custPhoneNumber = "0";
	this.custEmail = "None";

	public setCustomer(String number, String customer, String custPhoneNumber, String custEmail){
		if (!bought){
			this.customer = customer;
			this.custPhoneNumber = custPhoneNumber;
			this.custEmail = custEmail;
			this.bought = true;
		}
	}

	public editPlayer(String field, String input){
		//Figure out how to edit each field, Enums?
	}

	public 
}