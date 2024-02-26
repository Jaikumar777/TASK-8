package task8;

import java.util.Scanner;

public class Java9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int age = 0;
		System.out.printf("Enter the Age : ");
		age = input.nextInt();
		int res = age >= 60?0:1;
		switch (res)
		{
			case 0:
				System.out.printf("You are a Senior Citizen");
				break;
 
			case 1:
				System.out.printf("You are not a Senior Citizen");
				break;
		}

	}

}
