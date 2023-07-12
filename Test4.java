interface Drawable {
	void draw();
}

class Circle1 implements Drawable {
	@Override
	public void draw() {
		System.out.println("Drawing a circle");
	}
}

class Rectangle1 implements Drawable {
	@Override
	public void draw() {
		System.out.println("Drawing a rectangle");
	}
}

public class Test4 {
	public static void main(String[] args) {
		Circle1 circle = new Circle1();
		circle.draw();

		Rectangle1 rectangle = new Rectangle1();
		rectangle.draw();
	}
}
