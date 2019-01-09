package com.user;

import java.util.Scanner;

import com.service.Opration;

public class Test {
	public static void main(String[] args) {
		Opration op = new Opration();
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enetr ur choice");
			System.out
					.println("enetr 1 for add c and 2 for display couse 3 for add faculty  and 4 for display faculty");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				op.addc();
				break;
			case 2:
				op.displayc();
				break;
			case 3:
				op.addf();
				break;
			case 4:
				op.displayf();
				break;
			default:
				System.out.println("  plz enetr the correct choice");
				break;
			}

		}

	}

}
