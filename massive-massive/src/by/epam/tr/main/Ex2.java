package by.epam.tr.main;

import java.util.Random;

public class Ex2 {

	public static void main(String[] args) {
		// 2. Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами
		// из [0, 9].
		int[][] array = new int[2][3];
		Random rnd = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rnd.nextInt(9);
				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();
		}
		
	}

}
