//another subclass of customer superclass
  public class SeniorCustomer extends Customer {
		public static final double DISCOUNT = 0.20;

		public SeniorCustomer(String name, double amount) {
			//call the superclass constructor and pass the name and amount parameters
			super(name, amount);
		}

		@Override
		public double calculateBill() { //overriding the superclass method "calculateBill"      
			return (amount-(amount * DISCOUNT));
		}
	}
