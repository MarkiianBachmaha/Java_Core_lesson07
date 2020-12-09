package task01;

public class Application {

	public static void main(String[] args) {

		SU27 su27 = new SU27(21.9, 14.7, 23.5, 1500, "military");

		su27.startEngine();
		su27.takeoffOfThePlane();

		su27.planecontrol.moveUp();
		su27.planecontrol.moveLeft();
		su27.planecontrol.moveDown();
		su27.planecontrol.moveRight();

		su27.stealthTechnology();
		su27.nuclearStrike();
		su27.turboAcceleration();
		su27.landingThePlane();

	}

}