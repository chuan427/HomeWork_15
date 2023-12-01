package hw5;

public class No_4_myRectangle {
	
	private double width;
	private double depth;
	
	public No_4_myRectangle() {}
	
	
	public No_4_myRectangle(double width,double depth){
		this.width = width;
		this.depth = depth;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setDepth(double depth) {
		this.depth = depth;
	}
	
	public double getArea() {
		return width*depth;
	}

}
