package by.epam.tr.main;

public class Ex2 {

	public static void main(String[] args) {
		// 2. В целочисленной последовательности есть нулевые элементы. Создать массив
		// из номеров этих элементов.
		int[] array = new int[] { 899, 586, 212, 0, 432, 3, 0, 161, 0, 0, 754, 309, 361, 40, 14, 697, 422, 884, 0 };
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				count++;
			}
		}
		System.out.println("count = " + count);
		int[] arrayZero = new int[count];
		for (int i = 0, j = 0; i < array.length; i++) {
			if (array[i] == 0) {
				arrayZero[j] = i;
				j++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print("[" + array[i] + "]");
		}
		System.out.println();
		for (int i = 0; i < arrayZero.length; i++) {
			System.out.print("[" + arrayZero[i] + "]");
		}

	}
}
