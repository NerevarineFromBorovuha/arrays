package by.epam.tr.main;

public class Ex23 {

	public static void main(String[] args) {
		// 23. Сформировать квадратную матрицу порядка N по правилу:
		// и подсчитать количество положительных элементов в ней.

		double[][] array = new double[5][5];
		int n = array.length;
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = Math.sin(((i * i) - (j * j)) / n);
				System.out.printf("[%4.1f]", array[i][j]);
				if (array[i][j] > 0) {
					count++;
				}

			}
			System.out.println();
		}
		System.out.println("There are " + count + " positive numbers");

	}

}
