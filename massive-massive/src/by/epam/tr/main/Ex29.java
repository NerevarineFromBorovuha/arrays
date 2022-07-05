package by.epam.tr.main;

import java.util.Random;

public class Ex29 {

	public static void main(String[] args) {
		// 29. Найти положительные элементы главной диагонали квадратной матрицы.
		Random rnd = new Random();
		int n = 4;
		int array[][] = new int[n][n];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rnd.nextInt(-10, 10);
				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("Positive numbers:");
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if ((i == j) & (array[i][j] > 0)) {
					System.out.printf("[%4d]", array[i][j]);

				}
			}
		}

	}

}
