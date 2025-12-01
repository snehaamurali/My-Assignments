package week4.day1;
//Child extends base
public class ClickElement extends Click{

	public void click()
	{
		super.click();
		System.out.println("Element Clicked by id");
	}
public static void main(String[] args) {
	ClickElement clickOptions=new ClickElement();
	clickOptions.click();
}
}
