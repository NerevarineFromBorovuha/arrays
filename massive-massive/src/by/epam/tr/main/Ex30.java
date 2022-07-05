package by.epam.tr.main;

import java.util.Random;

public class Ex30 {

	public static void main(String[] args) {
		// 30. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран
		// саму матрицу и номера строк, в которых число 5 встречается три и более раз
		Random rnd = new Random();
		
		int array[][] = new int[10][20];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rnd.nextInt(15);
				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();
		}
		
		int count =0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j]==5) {
					count++;
				}
			}
			if (count>=3) {
				System.out.println("There are "+ count + " numbers(5) in string " + i);
			}
			count=0;
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
