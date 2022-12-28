public abstract class Customer //this is our superclass
{
	protected String name; //attributes are protected
	protected double amount;

	//constructor
	public Customer( String name, double amount){
	 this.name = name;
	 this.amount = amount;	
}

// this method will be overriden by its subclasses

public String getName(){
	return this.name;
}
	
public void setName( String name){
	this.name= name;
}

public abstract double calculateBill()
}




	
