package by.epam.tr.main;

import java.util.Random;

public class Ex5 {

	public static void main(String[] args) {
		// 5. Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив
		// из четных чисел этой последовательности. Если таких чисел нет, то вывести
		// сообщение об этом факте.
		Random rnd = new Random();
		int[] array = new int[10];
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(10);
			System.out.print("[" + array[i] + "]");
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("\nThere isn't even numbers ");
			return;
		}

		System.out.println("\ncount = " + count);
		int[] newArray = new int[count];
		for (int i = 0, j = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				newArray[j] = array[i];
				j++;
			}
		}

		for (int i = 0; i < newArray.length; i++) {
			System.out.print("[" + newArray[i] + "]");
		}

	}
}
