public class fors
{
	public static void main(String[] args)
	{
		int array[][];
		array = new int[3][3];

		for(int[] i : array)
		{
			for(int j: i)
			{
				j = 5 * 3;
				System.out.print("|" + j + "|");
			}
			System.out.print("\n");
		}
	}
}
