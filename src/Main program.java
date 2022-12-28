public class MainProgram { //Main class
	public static void main(String[] args) {
		Customer customer; //superclass object
		RegularCustomer RC  = new RegularCustomer("Hanan Ampaso", 500); //subclass object
		SeniorCustomer SC = new SeniorCustomer("Judeia Joson", 500); //another subclass object

		customer = RC;
		//calling the accessor from the superclass object
		System.out.println(customer.getName()+""+ " is a regular customer -"+" " +customer.calculateBill());

		customer = SC;
		System.out.println(customer.getName()+""+ " is a senior customer -"+" "+customer.calculateBill());
	}
}
