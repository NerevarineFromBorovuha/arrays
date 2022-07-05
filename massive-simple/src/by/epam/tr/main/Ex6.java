package by.epam.tr.main;

import java.util.Random;

public class Ex6 {

	public static void main(String[] args) {
		// 6. Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину
		// числовой оси, содержащую все эти числа.
		Random rnd = new Random();
		int[] array = new int[10];		
		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(100);
			System.out.print("[" + array[i] + "]");
		}
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}			
		}
		int result;
		result = max-min;	
		System.out.println("\nmax = " + max);
		System.out.println("min = " + min);
		System.out.println("result length = " + result);
	}
}
