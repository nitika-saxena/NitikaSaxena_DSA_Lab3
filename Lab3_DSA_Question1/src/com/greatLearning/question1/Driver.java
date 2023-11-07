package com.greatLearning.question1;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		BracketBalancing bb = new BracketBalancing ();

		System.out.println("Please enter a string of brackets:");
		Scanner sc  = new Scanner(System.in);

		String input = sc.nextLine();

		sc.close();
		
		//System.out.println(input);
		
		if (input == null || input.isEmpty()) { 
			System.out.println("The entered String is empty");
		}

		else if (bb.isBalancedBracket(input)) {
			System.out.println("The entered string has Balanced Brackets");

		} else { 
			System.out.println("The entered Strings do not contain Balanced Brackets");


		
}
	
	}
}
	