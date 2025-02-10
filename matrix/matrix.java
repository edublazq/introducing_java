public class matrix{

	public static void main(String[] args)
	{
		int matriz [][];
		matriz = new int[3][3];

		for(int i = 0; i <= 2; i++)
		{
			for(int j = 0; j <= 2; j++)
			{
				matriz[i][j] = i*j;
				System.out.print(" | " + matriz[i][j] + " | ");
			}
			System.out.print("\n");
		}
	}
}
