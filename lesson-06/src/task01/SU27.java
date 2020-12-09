package task01;

public class SU27 extends Plane implements SpecialOpportunities {

	private double maxSpeed;
	private String color;
	PlaneControl planecontrol = new PlaneControl();

	public SU27(double length, double width, double weight, double maxSpeed, String color) {
		super(length, width, weight);
		this.maxSpeed = maxSpeed;
		this.color = color;

	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public PlaneControl getPlanecontrol() {
		return planecontrol;
	}

	public void setPlanecontrol(PlaneControl planecontrol) {
		this.planecontrol = planecontrol;
	}

	@Override
	public void turboAcceleration() {
		System.out.println("The plane is moving with speed: " + (maxSpeed + Math.random() * 700) + " km/h");
	}

	@Override
	public void stealthTechnology() {
		System.out.println("The plane is invisible for:" + (Math.random() * 60) + " seconds");
	}

	@Override
	public void nuclearStrike() {
		System.out.println("The plane will drop " + ((int) (Math.random() * 10) + 1) + " nuclear bombs");
	}

}