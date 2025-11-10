package week1.day2;
public class FindOddNumbers {
	public static void main(String[] args) {
		int maxRange =10;
		System.out.println("Odd number between 1 to 10 is");
		for (int i =1; i<= maxRange; i++) {
			if (i % 2 != 0)
			{
				System.out.println( +i);
			}
		}
	}
}
