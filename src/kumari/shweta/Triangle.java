package kumari.shweta;

import org.springframework.beans.factory.annotation.Required;

public class Triangle {
	
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	public Point getPointA() {
		return pointA;
	}

	@Required
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	private String type;
	private int height;
	
	public Triangle(String type) {
	
		this.type = type;
	}
	
	public  Triangle(int height) {
		this.height = height;
	}

	//If we pass value of height  as string format Spring will automatically convert in int format
	public Triangle(String type, int height) {
		
		this.type = type;
		this.height = height;
	}

	public String getType() {
		return type;
	}

	public int getHeight() {
		return height;
	}

	/* For setter injection
	 * public void setType(String type) { this.type = type; }
	 */
	public void draw() {
	 System.out.println("type of traingle is"+this.getType()+" "+getHeight()+"  Triangle has been drawn with height");
	}
	
	public void printPoint() {
		
		System.out.println("Point A"+getPointA().getX()+" "+getPointA().getY()+getPointA());
		System.out.println("Point B"+getPointB().getX()+" "+getPointC().getY()+getPointB());
		System.out.println("Point C"+getPointC().getX()+" "+getPointC().getY()+getPointC());
		
		
	}
	
}
