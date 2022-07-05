package by.epam.tr.main;

import java.util.Random;

public class Ex37 {

	public static void main(String[] args) {
		// 37. Переставить строки матрицы случайным образом.
		Random rnd = new Random();
		int n = 5;
		int array[][] = new int[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rnd.nextInt(10);
				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------");
		int x;
		int y;
		int temp;
		for (int k = 0; k < rnd.nextInt(1, 20); k++) {
			x = rnd.nextInt(1, array.length - 1);
			y = rnd.nextInt(1, array.length - 1);
			for (int i = x; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					temp = array[i][j];
					array[i][j] = array[y][j];
					array[y][j] = temp;
				}

			}

		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();
		}

	}

}
