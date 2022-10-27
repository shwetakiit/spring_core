package kumari.shweta;

import org.springframework.beans.factory.annotation.Required;

public class RequiredAnnotationDemo {
	
	private Integer age;
	private String name;
	
	public Integer getAge() {
		return age;
	}
	
	//In spring 5 this annotation not working if we dont set property values in spring config it will give null data
	@Required
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	@Required
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
