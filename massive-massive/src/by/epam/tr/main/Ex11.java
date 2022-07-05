package by.epam.tr.main;

import java.util.Random;

public class Ex11 {

	public static void main(String[] args) {
		// 11. Дана матрица размера m x n. Вывести ее элементы в следующем порядке:
		// первая строка справа налево, вторая
		// строка слева направо, третья строка справа налево и так далее.
		int n = 5;
		int m = 6;
		int[][] array = new int[n][m];
		Random rnd = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rnd.nextInt(10);
				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();
		}

		System.out.println();
		for (int i = 0; i < array.length; i++) {
			if ((i == 0) | (i % 2 == 0)) {
				for (int j = 0; j < array[i].length; j++) {
					System.out.printf("[%4d]", array[i][j]);
				}
				System.out.println();
			} else {
				for (int j = 0; j < array[i].length; j++) {
					System.out.printf("[%4d]", array[i][array[i].length - 1 - j]);
				}
				System.out.println();
			}
		}
	}

}
