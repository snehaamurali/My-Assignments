package week3.day2;

public class Car extends Vehicle {
    public void applyHorn()
    {
    	System.out.println("Apply Horn");
    }
	public static void main(String[] args) {
		Car carOptions=new Car();
		carOptions.applyHorn();
		carOptions.applyBreak();
		
	}

}
