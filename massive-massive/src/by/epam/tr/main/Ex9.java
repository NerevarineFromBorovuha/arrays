package by.epam.tr.main;

import java.util.Random;

public class Ex9 {

	public static void main(String[] args) {
		// 9. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
		int[][] array = new int[5][5];
		Random rnd = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rnd.nextInt(10);
				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();
		}
		System.out.println("------------------------------");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i == j) {
					System.out.printf("[%4d]", array[i][j]);
				}
			}
		}
		System.out.println("\n------------------------------");
		for (int i = 0; i < array.length; i++) {

			System.out.printf("[%4d]", array[i][array[i].length - 1 - i]);
		}
	}

}
