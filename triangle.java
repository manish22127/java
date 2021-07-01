package two_b;

public class triangle {
	public float[] center_point(float base,float height) {
		float[] center = new float[2];
		center[0]=base+100;
		center[1]=base+200;
		return center;
	}
	
	public void calcarea(float base, float height) {
		double area = 0.5*base * height;
		System.out.println("Area of triangle is "+area);
	}
}
