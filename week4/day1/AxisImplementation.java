package week4.day1;

public class AxisImplementation extends Axis {

	@Override
	public void regulateKyc() {
		System.out.println("Driving License");
		
	}

	@Override
	public void setDepositLimit() {
    System.out.println("25");
		
	}
	public void houseLoan();
	
	{}

	@Override
	public void carLoan() {
		System.out.println("40 lakhs");
	}
public static void main(String[] args) {
	AxisImplementation axisOptions=new AxisImplementation();
	axisOptions.regulateKyc();
	axisOptions.setDepositLimit();
	axisOptions.carLoan();
}
}
