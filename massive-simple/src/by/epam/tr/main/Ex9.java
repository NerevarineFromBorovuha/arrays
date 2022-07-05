package by.epam.tr.main;

import java.util.Random;

public class Ex9 {

	public static void main(String[] args) {
		// 9. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и
		// наименьший элементы.
		Random rnd = new Random();
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(100);
			System.out.print("[" + array[i] + "]");
		}
		int max = array[0];
		int maxCount = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
				maxCount = i;
			}
		}
		int min = array[0];
		int minCount = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
				minCount = i;
			}
		}
		int temp = 0;
		temp=array[maxCount] ;
		array[maxCount] = array[minCount];
		array[minCount] = temp;
		System.out.println("\nmax = " + max + ", maxCount = " + maxCount);
		System.out.println("min = " + min + ", minCount = " + minCount);
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print("[" + array[i] + "]");

		}
	}
}
