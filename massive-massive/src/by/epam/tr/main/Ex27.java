package by.epam.tr.main;

import java.util.Scanner;
import java.util.Random;

public class Ex27 {

	public static void main(String[] args) {
		// 27. В числовой матрице поменять местами два столбца любых столбца, т. е. все
		// элементы одного столбца поставить на
		// соответствующие им позиции другого, а его элементы второго переместить в
		// первый. Номера столбцов вводит пользователь с клавиатуры.
		Random rnd = new Random();
		int n = 4;
		int array[][] = new int[n][n];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rnd.nextInt(100);
				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter column number 1  >");
		int k = sc.nextInt();
		System.out.print("Enter column number 2  >");
		int m = sc.nextInt();
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			temp = array[i][k];
			array[i][k] = array[i][m];
			array[i][m] = temp;

		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();
		}

	}

}
