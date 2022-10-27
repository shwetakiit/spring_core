package kumari.shweta.springcorewithAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.DefaultManagedTaskExecutor;

public class Client {


@Autowired
	DataSourceBean dataSourceBean;
	//DataSourceBean dataSourceBean;
	
	public void showData() {
		System.out.println(dataSourceBean.someData());
	}
}
