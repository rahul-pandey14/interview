package com.interview.pattern;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println();
		Pattern1 p = new Pattern1();
		p.print(n);
	}

	public void print(int n) {

		for (int i = 0; i < n; i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print("*\t");

			}
			System.out.println();
		}

	}

}
