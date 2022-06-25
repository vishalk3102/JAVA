import java.util.*;
import java.lang.Math;

interface calVolume {
	abstract void DisplayVolume();
}

class Cone implements calVolume {
	private int r, h;

	public Cone(int r, int h) {
		this.r = r;
		this.h = h;
	}

	public void DisplayVolume() {
		double volume;
		volume = (1 * Math.PI * r * r * h) / 3;
		System.out.println("The volume of cone is :" + volume);
	}

}

class Hemisphere implements calVolume {
	private int r;

	public Hemisphere(int r) {
		this.r = r;
	}

	public void DisplayVolume() {
		double volume;
		volume = (2 * Math.PI * r * r * r) / 3;
		System.out.println("The volume of hemisphere is :" + volume);
	}
}

class Cylinder implements calVolume {
	private int r, h;

	public Cylinder(int r, int h) {
		this.r = r;
		this.h = h;
	}

	public void DisplayVolume() {
		double volume;
		volume = Math.PI * r * r * h;
		System.out.println("The volume of cylinder is :" + volume);
	}
}

public class Volume {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the radius and height of cone :");
			int rCone = sc.nextInt();
			int hCone = sc.nextInt();
			Cone c = new Cone(rCone, hCone);
			c.DisplayVolume();

			System.out.println("Enter the radius of hemisphere:");
			int rHemisphere = sc.nextInt();
			Hemisphere h = new Hemisphere(rHemisphere);
			h.DisplayVolume();

			System.out.println("Enter the radius and height of cylinder:");
			int rCylinder = sc.nextInt();
			int hCylinder = sc.nextInt();
			Cylinder r = new Cylinder(rCylinder, hCylinder);
			r.DisplayVolume();
		}
	}

}
