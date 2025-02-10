public class arrays
{
	public static void main(String[] args)
	{
		int [] numeros;
		numeros = new int[10];
		for (int i = 0; i <= 9; i++)
		{
			numeros[i] = i + 1;
			System.out.println(numeros[i]);
		}
	}
}
