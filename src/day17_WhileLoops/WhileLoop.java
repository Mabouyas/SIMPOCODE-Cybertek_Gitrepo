package day17_WhileLoops;

import java.util.Scanner;

public class WhileLoop
{
	public static void main(String[] args)
	{
		for (int i = 5; i > 0; i--)
		
		{
			for (int j = 0; j < i; j++)
			{
				System.out.print(j + 1);
			}
			
			System.out.println();
		}
		
	}
}