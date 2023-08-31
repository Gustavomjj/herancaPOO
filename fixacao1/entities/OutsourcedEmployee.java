package herança.fixacao1.entities;

public class OutsourcedEmployee extends Employee {

	private Double additionalCharge;
	
	
	
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}


	@Override
	public double payment(int hours, double valuePerHour) {
		double valuePayment = (hours * valuePerHour) + (additionalCharge * 1.1);
		return valuePayment;
	}
	


	
}
