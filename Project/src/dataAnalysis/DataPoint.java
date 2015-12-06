package dataAnalysis;

public class DataPoint {
	// Private variables.
	private double x;
	private double y;
	private double frame;

	// Constructor.
	public DataPoint() {
	}

	// Set the data points.
	public DataPoint(double pub_x, double pub_y, double pub_frame) {
		x = pub_x;
		y = pub_y;
		frame = pub_frame;
	}

	// Gets x,y,z values back

	public double get_x() {
		return x;
	}

	public double get_y() {
		return y;
	}

	public double get_frame() {
		return frame;
	}

	public String toString() {
		return ("x = " + x + ", y = " + y + ", frame = " + frame);
	}

}
