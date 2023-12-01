package hw5;

public class No_5_myRectangleMain {

	public static void main(String[] args) {
		
		No_4_myRectangle myRectangle = new No_4_myRectangle();
		myRectangle.setWidth(10);
		myRectangle.setDepth(20);
		
		System.out.println(myRectangle.getArea());
	//------------------------------------------------------------------------------	
		No_4_myRectangle myRectangle2 = new No_4_myRectangle(10,20);
		
		System.out.println(myRectangle2.getArea());
	}

}
