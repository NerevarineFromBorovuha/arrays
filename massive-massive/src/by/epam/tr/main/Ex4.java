package by.epam.tr.main;

import java.util.Random;

public class Ex4 {

	public static void main(String[] args) {
		// 4. Дана матрица. Вывести на экран первую и последнюю строки.
		int[][] array = new int[5][6];
		Random rnd = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rnd.nextInt(100);
				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for (int j = 0; j < array[array.length-1].length; j++) {
			System.out.printf("[%4d]", array[0][j]);
		}
		System.out.println();
		for (int j = 0; j < array[array.length-1].length; j++) {
			System.out.printf("[%4d]", array[array.length-1][j]);
		}

	}

}
