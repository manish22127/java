package two_b;

public class square {
	public float[] center_point(float side) {
		float[] center = new float[2];
		center[0]=side+100;
		center[1]=side+200;
		return center;
	}
	
	public void calcarea(float side) {
		float area = side * side;
		System.out.println("Area of square is "+area);
	}
}
