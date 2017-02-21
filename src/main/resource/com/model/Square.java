package resource.com.model;

public class Square implements Shape {

	private Point pointA;
	private Point pointB;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub

	}

}
