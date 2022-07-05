package by.epam.tr.main;

import java.util.Random;
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// 13. Определить количество элементов последовательности натуральных чисел,
		// кратных числу М и заключенных в промежутке от L до N.
		Random rnd = new Random();
		int[] array = new int[20];

		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(100);
			System.out.print("[" + array[i] + "]");
		}
		System.out.println("\nArray length is "+array.length);
		Scanner sc = new Scanner(System.in);
		int l;
		int n;
		int m;
		
		System.out.print("Press L(L<array length) > ");
		l = sc.nextInt();
		System.out.print("Press N (N<L) > ");
		n = sc.nextInt();

		if ((n < l) & (l < array.length) & (n>=0) & (l>=0)) {
		} else {
			System.out.println("wrong");
			return;
		}
		System.out.print("Press M ");
		m = sc.nextInt();
		
		int count=0;
		for (int i = n; i <= l; i++) {
			if (array[i] % m == 0) {
				count++;
				System.out.print("[" + array[i] + "]");
			}
		}
		
		System.out.println("\nThere are "+ count+" number");
	}

}
