package kumari.shweta;

import java.util.HashMap;
import java.util.List;
import java.util.Properties;



public class ListPointTriangle {
	
	Properties prop = new Properties();
	private List<Point> points;
	
	private HashMap<String,String> hashMap;
	
	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public List<Point> getPoints() {
		return points;
	}
	
	public HashMap<String, String> getHashMap() {
		return hashMap;
	}

	public void setHashMap(HashMap<String, String> hashMap) {
		this.hashMap = hashMap;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	
	
	
	
  public void draw() {
	  for(Point  point : points) {
		  System.out.println("Point = ("+point.getX()+","+point.getY()+")");
	  }
	  
	  System.out.println("Prperties values are");
	  for(Object keyString:getProp().keySet()) {
		  
		  String value = getProp().getProperty((String) keyString);
		  System.out.println("Key :"+keyString+" Value :"+value);
		  
		  
	  }
	  System.out.println("Map values are");
	  for(String key :hashMap.keySet()) {
		  System.out.println("Key "+key+" Value is "+hashMap.get(key));
	  }
	  
  }
	

}
