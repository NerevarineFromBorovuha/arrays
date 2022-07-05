package by.epam.tr.main;

import java.util.Random;

public class Ex8 {

	public static void main(String[] args) {
		// 8. Дан массив действительных чисел, размерность которого N. Подсчитать,
		// сколько в нем отрицательных, положительных и нулевых элементов.
		Random rnd = new Random();
		int n = 10;
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(-10,10);
			System.out.print("[" + array[i] + "]");
		}
		//////////
		int countZero = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				countZero++;
			}
		}
		System.out.print("\ncountZero = " + countZero);
		////////////
		int countPlus = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				countPlus++;
			}
		}
		System.out.print("\ncountPlus = " + countPlus);
		//////////////////
		int countMinus = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				countMinus++;
			}
		}
		System.out.print("\ncountMinus = " + countMinus);

	}
}
