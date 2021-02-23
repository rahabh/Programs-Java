package oops;

public class Shapefactory {

	public ShapeInterface getShape (String shapeType) {
		if (shapeType == null) {
			return null;
		}
		else if (shapeType.equalsIgnoreCase("square")) {
			return new SquareShape();
		}
		else if (shapeType.equalsIgnoreCase("Rectangle")) {
			return new RectangleShape();
		}
		return null;
	}
}
