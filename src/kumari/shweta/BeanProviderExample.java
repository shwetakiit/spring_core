package kumari.shweta;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class BeanProviderExample {
	
	@Bean
	BeanExample exampleBean() {
	return	new BeanExample();
	}

	
	//Due to tow beans we will get exception =objectProvider1.getIfUnique(); Of non unique

	@Bean
	BeanExample exampleBean1() {
		return new BeanExample();
	}
}
