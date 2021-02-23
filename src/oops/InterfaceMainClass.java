package oops;

public class InterfaceMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapefactory shapefactory = new Shapefactory();
		
		ShapeInterface sh = shapefactory.getShape("square");
		sh.shape();
		
		ShapeInterface sh1 = shapefactory.getShape("Rectangle");
		sh1.shape();
		
	}

}
