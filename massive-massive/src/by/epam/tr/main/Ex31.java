package by.epam.tr.main;

public class Ex31 {

	public static void main(String[] args) {
		// 31. Сформировать матрицу из чисел от 0 до 999, вывести ее на экран.
		// Посчитать количество двузначных чисел в ней.
		int array[][] = new int[25][40];
		int k = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = k;
				System.out.printf("[%4d]", array[i][j]);
				k++;
			}
			System.out.println();
		}
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if ((array[i][j] > 9) & (array[i][j] < 100)) {
					count++;
				}
			}
		}
		System.out.println("There are " + count + " numbers ");

	}

}
