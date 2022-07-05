package by.epam.tr.main;

public class Ex34 {

	public static void main(String[] args) {
		// 34. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем
		// в каждом столбце число единиц равно номеру столбца.
		int m = 6;
		int n = 5;
		int array[][] = new int[m][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();
		}
		int count = 0;
		for (int j = 0; j < array[n].length; j++) {
			count = 0;
			for (int i = 0; i < array.length; i++) {
				if (j >= count)
					array[i][j] = 1;
				count++;
			}
		}

		System.out.println("-----------------------------------------");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();
		}

	}

}
