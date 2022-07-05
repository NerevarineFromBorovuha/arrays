package by.epam.tr.main;

import java.util.Random;

public class Ex35 {

	public static void main(String[] args) {
		// 35. Найдите наибольший элемент матрицы и заменить все нечетные элементы на
		// него.

		Random rnd = new Random();

		int array[][] = new int[5][5];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rnd.nextInt(99);
				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();
		}
		int max = array[0][0];
		System.out.println("------------------------------------------------");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (max < array[i][j]) {
					max = array[i][j];
				}

			}

		}
		System.out.println("max number is " + max);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] % 2 != 0) {
					array[i][j] = max;
				}
				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();

		}

	}

}
