package kumari.shweta.springcorewithAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {
	
	@Bean
	DataSourceBean dataSourceBean() {
		return new DataSourceBean();
	}

}
