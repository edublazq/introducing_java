public class circle
{
	private double radius;
	final double PI = 3.141592;

	public circle(double radius)
	{
		this.radius = radius;	
	}

	public double area()
	{
		return PI*radius*radius;
	}

	public static void main(String[] args)
	{
		circle c1 = new circle(7.8);
		System.out.println("El area es: " + c1.area());
	}
}
