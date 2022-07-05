package by.epam.tr.main;

import java.util.Random;

public class Ex5 {

	public static void main(String[] args) {
		// 5. Дана матрица. Вывести на экран все четные строки, то есть с четными
		// номерами
		int[][] array = new int[8][6];
		Random rnd = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rnd.nextInt(100);
				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 2; i < array.length; i += 2) {
			System.out.printf(i+ " string ");
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();
		}
	}
}
