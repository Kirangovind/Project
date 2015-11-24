package chipDim;

public class FindFeruleHolderDimensions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// (Ferule Holder Depth, Radius Allowance)
		FeruleHolderDimensions n_d = new FeruleHolderDimensions (1.5, 0);
		System.out.println("Angle: "+n_d.Angle()+"degrees");
		System.out.println("Base: "+(n_d.A())+"mm");
		System.out.println("Side: "+n_d.C()+"mm");
	}

}
