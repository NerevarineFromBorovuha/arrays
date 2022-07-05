package by.epam.tr.main;

import java.util.Random;
import java.util.Arrays;

public class Ex32 {

	public static void main(String[] args) {
		// 32. Отсортировать строки матрицы по возрастанию и убыванию значений элементов
		Random rnd = new Random();

		int array[][] = new int[5][5];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rnd.nextInt(15);
				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();
		}
		for (int i = 0; i < array.length; i++) {
			Arrays.sort(array[i]);
		}

		System.out.println("------------------(sort +)-------------------");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();
		}

		int max;
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length - 1; j++) {
				max = j;
				for (int k = j + 1; k < array[i].length; k++) {
					if (array[i][k] > array[i][max]) {
						max = k;
					}
				}
				temp = array[i][j];
				array[i][j] = array[i][max];
				array[i][max] = temp;

			}
		}

		System.out.println("-------------------(sort -)---------------------");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();
		}

	}

}
