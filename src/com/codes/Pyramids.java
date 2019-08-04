package com.codes;

import java.util.Scanner;

public class Pyramids {

	int row = 5;
	int num = 1;
	int k;

	public void pyramidFormation() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1. Half Pyramid Using Star \n" + "2. Half Pyramid Using Numbers Same In Row \n"
				+ "3. Half Pyramid Using Numbers Same In Column \n" + "4. Inverted Half Pyramid Using Star\n"
				+ "5. Inverted Half Pyramid Using Numbers Same In Row\n" + "6. Inverted Half Pyramid Using "
				+ "Numbers Same In Column \n" + "7. Inverted And Half Pyramid Using Numbers Same In Column\n"
				+ "8. Inverted And Half Pyramid Using Numbers Same In Row \n" + "9. Pyramid \n"
				+ "10. Floyds Triangle \n" + "11. Inverted Pyramid \n" + "12. Two Inverted Pyramid");
		
		boolean flag = true;

		while (flag) {

			System.out.println("Enter your choice");
			String pTypes = sc.nextLine();
			switch (pTypes) {
			case "1":
				halfPyramidUsingStar();
				break;
			case "2":
				halfPyramidUsingNumbersSameInRow();
				break;
			case "3":
				halfPyramidUsingNumbersSameInColumn();
				break;
			case "4":
				invertedHalfPyramidUsingStar();
				break;
			case "5":
				invertedHalfPyramidUsingNumbersSameInRow();
				break;
			case "6":
				invertedHalfPyramidUsingNumbersSameInColumn();
				break;
			case "7":
				invertedAndHalfPyramidUsingNumbersSameInColumn();
				break;
			case "8":
				invertedAndHalfPyramidUsingNumbersSameInRow();
				break;
			case "9":
				pyramid();
				break;
			case "10":
				floydsTriangle();
				break;
			case "11":
				invertedPyramid();
				break;
			case "12":
				twoPyarmids();
				break;
			default:
				flag = false;
				break;
			}
		}
	}

	private void twoPyarmids() {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j < row - i; j++) {
				System.out.print(" ");
			}
			for (k = 1; k <= 2 * i - 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = row; i >= 1; i--) {
			for (int j = 1; j <= (row - i); j++) {
				System.out.print(" ");
			}
			for (k = 1; k <= (2 * i - 1); k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	private void invertedPyramid() {
		for (int i = row; i >= 1; i--) {
			for (int j = 0; j <= (row - i); j++) {
				System.out.print(" ");
			}
			for (k = 1; k <= (2 * i - 1); k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	private void pyramid() {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j < row - i; j++) {
				System.out.print(" ");
			}
			for (k = 1; k <= 2 * i - 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private void floydsTriangle() {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}

	private void invertedAndHalfPyramidUsingNumbersSameInRow() {
		for (int i = row; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		for (int i = 2; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	private void invertedAndHalfPyramidUsingNumbersSameInColumn() {
		for (int i = row; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i = 2; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	private void invertedHalfPyramidUsingNumbersSameInColumn() {
		for (int i = row; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

	private void invertedHalfPyramidUsingNumbersSameInRow() {
		for (int i = row; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

	private void invertedHalfPyramidUsingStar() {
		for (int i = row; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	private void halfPyramidUsingNumbersSameInColumn() {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

	public void halfPyramidUsingNumbersSameInRow() {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

	public void halfPyramidUsingStar() {

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pyramids p = new Pyramids();
		p.pyramidFormation();
	}

}
