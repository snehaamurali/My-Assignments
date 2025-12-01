package week4.day1;
//SBI is implementation class for RBI
public class SBI implements RBI{

	@Override
	public void regulateKyc() {
	System.out.println("PAN is mandatory");
		
	}

	@Override
	public void setDepositLimit() {
		System.out.println("10 lakhs");
		
		
	}
	public static void main(String[] args) {
		SBI sbiOptions=new SBI();
		sbiOptions.regulateKyc();
		sbiOptions.setDepositLimit();
}
}