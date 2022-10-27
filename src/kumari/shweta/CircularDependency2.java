package kumari.shweta;

public class CircularDependency2 {
	CircularDependency1 circularDependency1;
	
	CircularDependency2(CircularDependency1 circularDependency1){
		this.circularDependency1=circularDependency1;
	}

}
