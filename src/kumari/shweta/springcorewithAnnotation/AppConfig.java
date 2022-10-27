package kumari.shweta.springcorewithAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(DataSourceBean.class)
public class AppConfig {
	
	
	@Bean
	Client clientBean() {
		return new Client();
	}
	
	public static void main(String[] args) {
		
AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		context.getBean(Client.class).showData();
		
	}

}
