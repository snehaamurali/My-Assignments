package week3.day2;

public class Benz extends Vehicle{
    public void driveFast()
    {
    	System.out.println("Drive fast");
    }
    
	public static void main(String[] args) {
		Benz benzOptions= new Benz();
		benzOptions.driveFast();
		benzOptions.applyBreak();
		benzOptions.applyHorn();

	}

}
