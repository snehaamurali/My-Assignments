package week2.day1;

public class Iphone {
    public void takePhoto()
    {
    	System.out.println("Take photo");
    }
    public void makeCall()
    {
    	System.out.println("Make call");
    } 
    
	public static void main(String[] args) {
		//create object
		Iphone iphoneOptions= new Iphone();
		iphoneOptions.takePhoto();
		iphoneOptions.makeCall();

	}

}
