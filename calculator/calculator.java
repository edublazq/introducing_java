import java.io.*;
import static java.lang.Math.*;

public class calculator
{
	private int operator1;
	private int operator2;

	public calculator(int op1, int op2)
	{
		this.operator1 = op1;
		this.operator2 = op2;
	}

	public int add()
	{
		return operator1 + operator2;
	}

	public int sustract()
	{
		return operator1 - operator2;
	}

	public static void main(String[] args)
	{
		Console console = System.console();
		System.out.println("Elija opcion: ");
		System.out.println("Suma [1]\nResta[2]");
		int opcion = Integer.parseInt(console.readLine());
		switch(opcion)
		{
			default:
				System.out.println("Opcion invalida");
				break;
			case 1:
			case 2:
				break;
		}
		System.out.println("Introduzca el primer valor: ");
		int a,b;
		a = Integer.parseInt(console.readLine());
		System.out.println("Introduzca el segundo valor: ");
		b = Integer.parseInt(console.readLine());
		calculator operacion = new calculator(a,b);
		if(opcion == 1)
		{
			System.out.println("El resultado es: " + operacion.add());
		}
		if(opcion == 2)
		{
			System.out.println("El resultado es:" + operacion.sustract());
		}
	}
	

}
