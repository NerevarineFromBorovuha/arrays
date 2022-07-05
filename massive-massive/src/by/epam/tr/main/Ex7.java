package by.epam.tr.main;

import java.util.Random;

public class Ex7 {

	public static void main(String[] args) {
		// 7. Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных
		// элементов.
		int[][] array = new int[5][5];
		Random rnd = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rnd.nextInt(-10, 10);
				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();
		}
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if ((array[i][j] < 0) & (array[i][j] % 2 != 0)) {
					sum = sum + Math.abs(array[i][j]);
				}
			}

		}
		System.out.println("sum = " +sum);
	}

}
