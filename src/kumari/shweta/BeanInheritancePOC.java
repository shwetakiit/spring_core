package kumari.shweta;

public class BeanInheritancePOC {
	
	Point pointA;
	Point pointB;
	Point pointC;
	public Point getPointA() {
		return pointA;
	}
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
	
	public void draw() {
		
		System.out.println("Point A ("+getPointA().getX()+" "+getPointA().getY()+")" +getPointA());
		System.out.println("Point B"+getPointC().getX()+" "+getPointC().getY()+getPointB());
		System.out.println("Point C"+getPointC().getX()+" "+getPointC().getY()+getPointC());
		
	}
	

}
