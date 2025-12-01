package week4.day1;

public class Hdfc implements RBI {

	@Override
	public void regulateKyc() {
		System.out.println("Aadhar Card");
		
	}

	@Override
	public void setDepositLimit() {
		System.out.println("50 lakhs");
		
	}
 public static void main(String[] args) {
Hdfc hdfcOptions=new Hdfc();
hdfcOptions.regulateKyc();
hdfcOptions.setDepositLimit();
}
}
