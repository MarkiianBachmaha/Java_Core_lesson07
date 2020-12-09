package task01;

public abstract class Plane {

	private double length;
	private double width;
	private double weight;

	public Plane(double length, double width, double weight) {
		super();
		this.length = length;
		this.width = width;
		this.weight = weight;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void startEngine() {
		double time;
		time = Math.random() * (88 - 20) + 20;
		System.out.println("Ready to take off in: " + time + " seconds");
	}

	public void takeoffOfThePlane() {
		System.out.println("The plane will fly " + (Math.random() * 1000) + " km on the full tank");
	}

	public void landingThePlane() {
		System.out.println("The plane is landing");
	}

}