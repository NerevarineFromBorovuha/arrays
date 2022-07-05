package by.epam.tr.main;

import java.util.Random;

public class Ex12 {

	public static void main(String[] args) {
		// 12. Задана последовательность N вещественных чисел. Вычислить сумму чисел,
		// порядковые номера которых являются простыми числами.
		Random rnd = new Random();
		int[] array = new int[30];
		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(100);
			System.out.print("[" + array[i] + "]");
		}
		System.out.println();

		
		System.out.print("[" + array[2] + "]"+"[" + array[3] + "]");
		for (int i = 3; i < array.length; i = i + 2) {
			for(int j=3;j<array.length;j++) {
				if (j>Math.sqrt(i)) {
					System.out.print("[" + array[i] + "]");
			}
			
			}
			

		}
	}

}
