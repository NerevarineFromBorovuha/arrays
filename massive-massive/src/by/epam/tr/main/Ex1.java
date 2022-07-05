package by.epam.tr.main;

public class Ex1 {

	public static void main(String[] args) {
		// 1. Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной
		// строке была ровно одна единица, и вывести на экран.
		int[][] array = new int[3][4];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][0] = 1;
				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();
		}

	}

}
