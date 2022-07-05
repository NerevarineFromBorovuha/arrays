package by.epam.tr.main;

import java.util.Random;

public class Ex38 {

	public static void main(String[] args) {
		// 38. Найдите сумму двух матриц
		Random rnd = new Random();
		int n = 5;
		int array1[][] = new int[n][n];
		int array2[][] = new int[n][n];
		int array3[][] = new int[n][n];
		System.out.println("first matrix");
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				array1[i][j] = rnd.nextInt(10);
				System.out.printf("[%4d]", array1[i][j]);
			}
			System.out.println();
		}
		System.out.println("second matrix");
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				array2[i][j] = rnd.nextInt(10);
				System.out.printf("[%4d]", array2[i][j]);
			}
			System.out.println();
		}
		System.out.println("sum matrix");
		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3[i].length; j++) {
				array3[i][j] = array1[i][j] + array2[i][j];
				System.out.printf("[%4d]", array3[i][j]);

			}
			System.out.println();
		}

	}

}
