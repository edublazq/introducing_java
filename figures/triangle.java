public class triangle
{
	private double base;
	private double altura;

	public triangle(double base, double altura)
	{
		this.base = base;
		this.altura = altura;
	}

	public double area()
	{
		return (base*altura)/2;
	}
	
	public static void main(String[] args)
	{
		String var = "\nEspa\u00F1a";
		triangle t1 = new triangle(1.5 , 2);
		System.out.println("El area es: " + t1.area() + var);
	}
}
