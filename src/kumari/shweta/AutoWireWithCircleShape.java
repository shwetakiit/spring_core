package kumari.shweta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AutoWireWithCircleShape implements Shape{

	private Point center;
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
		System.out.println("Center("+center.getX()+","+center.getY()+")");
	}


	public Point getCenter() {
		return center;
	}

	@Autowired
	@Qualifier("test")
   public void setCenter(Point center) {
		this.center = center;
	}
	
	
}
