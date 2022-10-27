package kumari.shweta;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;


@Component
 class ComponentAnnotationCircle implements Shape,ApplicationEventPublisherAware{
	
	Point center;
	
	@Autowired
	private MessageSource messageSource;
	
	private ApplicationEventPublisher publisher;
	
	public Point getCcenter() {
		return center;
	}
public MessageSource getMessageSource() {
		return messageSource;
	}

//We can get message of property file by injecting bean so it will print from draw method
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
@Resource(name="pointA")
	public void setCcenter(Point center) {
		this.center = center;
	}
	@Override
	public void draw() {

		//System.out.println("Circle("+center.getX()+","+center.getY()+")");
		//System.out.println("drwaing.point",new Object[] {center.getX(),center.getY()});

		 //We can get message of property file by injecting bean so it will print from draw method
		System.out.println(messageSource.getMessage("greeting",null, "Default Message", null));
	   System.out.println(messageSource.getMessage("drwaing.point",new Object[] {center.getX(),center.getY()}, "Default point Message", null));
	  
	   //Our cunstom event andling
	   DrawEvent drawEvent= new DrawEvent(this);
	   publisher.publishEvent(drawEvent);
		
	}
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		// TODO Auto-generated method stub
		this.publisher=publisher;
	}
	
	
	

}
