package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int number;
		int call;
		NissanTiida b=new NissanTiida();
		System.out.println("Please enter a number");
		number=new Scanner(System.in).nextInt();
		for(call=1;call<=number;call++)
		{
			System.out.printf("²Ä%d¦¸©I¥s\n",call);
			b.NissanTiida(call);
			System.out.printf("\n");
		}
		
	}
	

}
