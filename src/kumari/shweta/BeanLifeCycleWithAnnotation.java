package kumari.shweta;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifeCycleWithAnnotation {

	
@PostConstruct
public void init() {
	System.out.println("Bean has been intialized");
}

@PreDestroy
public void destroy() {

	System.out.println("Before destroying bean ");
}
}
