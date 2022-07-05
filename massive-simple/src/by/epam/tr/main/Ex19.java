package by.epam.tr.main;



public class Ex19 {

	public static void main(String[] args) {
		// 19. В массиве целых чисел с количеством элементов n найти наиболее часто
		// встречающееся число. Если таких чисел несколько, то определить наименьшее из
		// них.
		
	
		int[] array = new int[] {0,2,3,4,1,12,1,9,1,10};

		for (int i = 0; i < array.length; i++) {
			System.out.print("[" + array[i] + "]");
		}
		int count;
		for (int i=0;i<array.length;i++) {
			count=1;
			for (int j=i+1;j<array.length;j++) {
				if (array[i]==array[j]) {
					count++;					
				}				
			}
			
			System.out.print("\ncount "+ i + " number=" + count);
		}

	}

}
