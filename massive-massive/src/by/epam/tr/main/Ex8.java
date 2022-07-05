package by.epam.tr.main;

import java.util.Random;

public class Ex8 {

	public static void main(String[] args) {
		// 8. Дан двухмерный массив n×m элементов. Определить, сколько раз встречается
		// число 7 среди элементов массива
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
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == 7) {
					count++;

				}
			}
		}
		System.out.println("count = " + count);

	}

}
