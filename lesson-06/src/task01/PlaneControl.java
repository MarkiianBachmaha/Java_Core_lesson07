package task01;

public class PlaneControl {

	public void moveUp() {
		System.out.println("Move UP on " + Math.random() * 30 + " km");
	}

	public void moveDown() {
		System.out.println("Move DOWN on " + Math.random() * 30 + " km");
	}

	public void moveLeft() {
		System.out.println("Move LEFT on " + Math.random() * 30 + " km");
	}

	public void moveRight() {
		System.out.println("Move RIGHT on " + Math.random() * 30 + " km");
	}

}