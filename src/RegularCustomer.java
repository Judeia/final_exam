//subclass of customer superclass
	public class RegularCustomer extends Customer {
		
		public RegularCustomer(String name, double amount) {
		//call the superclass constructor and pass the name and amount parameters
			super(name, amount);
		}

		@Override
		public double calculateBill() { // overriding the superclass method "calculateBill"
			return amount;
		}
	}
