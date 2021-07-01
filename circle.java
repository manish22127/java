package two_b;

public class circle {
	public float[] center_point(float radius) {
		float[] center = new float[2];
		center[0]=radius+100;
		center[1]=radius+200;
		return center;
	}
	public void calcarea(float radius) {
		double area = 3.14 * radius * radius;
		System.out.println("Area of circle "+area);
	}

}
