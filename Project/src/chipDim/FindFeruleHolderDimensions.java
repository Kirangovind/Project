package chipDim;

public class FindFeruleHolderDimensions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FeruleHolderDimensions n_d = new FeruleHolderDimensions (0.5, 0.125);
		System.out.println("Angle: "+n_d.Angle()+"degrees");
		System.out.println("a: "+n_d.A()+"mm");
		System.out.println("c: "+n_d.C()+"mm");
	}

}
