package chipDim;

public class FeruleHolderDimensions {

	private double d, r;
	 
	// Asks the user to set the depth of the ferule holder and the
	// width of the ferule and radiance allowance.
	
	public FeruleHolderDimensions (double depth, double diam, double diamAllow) {
		d = depth;
		r = (diam/2)+(diamAllow)/2;
	}
	
	public double Angle() {
		return (Math.toDegrees(Math.asin(r/(d-(0.125/2)))));
	}
	
	public double A() {
		return (2*(d*Math.tan(Math.toRadians(this.Angle()))));
	}
	
	public double C() {
		return (d/Math.cos(Math.toRadians(this.Angle())));
	}
}
