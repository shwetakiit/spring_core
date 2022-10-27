package kumari.shweta;

public class CircularDependency1 {
	
	CircularDependency2 circularDependency2;
	CircularDependency1(CircularDependency2 circularDependency2){
		this.circularDependency2=circularDependency2;
	}

}
