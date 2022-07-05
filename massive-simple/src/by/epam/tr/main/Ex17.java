package by.epam.tr.main;

public class Ex17 {

	public static void main(String[] args) {
		// 17. Дана последовательность целых чисел n a ,a , ,a 1 2  . Образовать новую
		// последовательность, выбросив из исходной
		// те члены, которые равны min
		int[] array = new int[] { 4, 2, 43, 1, 3, 5, 87, 1, 1, 78 };
		for (int i = 0; i < array.length; i++) {
			System.out.print("[" + array[i] + "]");
		}
		int min = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.print("\nmin=" + min);
		int count = 0;

		for (int i = 1; i < array.length; i++) {
			if (array[i] == min) {
				count++;
			}
		}
		System.out.print("\ncount=" + count + "\n");

		int[] newArray = new int[array.length - count];

		for (int i = 0, j = 0; i < array.length; i++) {
			if (array[i] != min) {
				newArray[j] = array[i];
				j++;
			}

		}
		for (int i = 0; i < newArray.length; i++) {
			System.out.print("[" + newArray[i] + "]");
		}
	}
}
