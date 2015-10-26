package chipDim;

public class FeruleHolderDimensions {

	private double d, w;
	 
	// Asks the user to set the depth of the ferule holder and the
	// width of the ferule.
	public FeruleHolderDimensions (double e, double f) {
		d = e;
		w = f;
	}
	
	public double Angle() {
		return (Math.toDegrees(Math.asin(w/d)));
	}
	
	public double A() {
		return (d*Math.tan(Math.toRadians(this.Angle())));
	}
	
	public double C() {
		return (d/Math.cos(Math.toRadians(this.Angle())));
	}
}
