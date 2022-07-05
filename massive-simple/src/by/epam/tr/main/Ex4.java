package by.epam.tr.main;

public class Ex4 {

	public static void main(String[] args) {
		// 4. Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить,
		// будет ли она возрастающей.
		double[] array = new double[] { 9, 10, 11, 12, 13, 14, 15, 16 };
		int count = 1;
		for (int i = 0; i < array.length; i++) {
			System.out.print("[" + array[i] + "]");
		}

		for (int i = 1; i < array.length; i++) {
			if (array[i] > array[i - 1]) {
				count++;
			}
		}
		System.out.println();
		if (count == array.length) {
			System.out.println("increasing array ");
		} else {
			System.out.println("It isn't increasing array ");
		}
	}
}
