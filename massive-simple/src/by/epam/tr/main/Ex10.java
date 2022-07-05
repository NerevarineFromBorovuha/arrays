package by.epam.tr.main;

import java.util.Random;

public class Ex10 {

	public static void main(String[] args) {
		// 10. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для
		// которых аi > i.
		Random rnd = new Random();
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(-10,10);
			System.out.print("[" + array[i] + "]");
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			if (array[i] > i) {
				System.out.print("[" + array[i] + "]");
			}

		}
	}
}
