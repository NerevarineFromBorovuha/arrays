package by.epam.tr.main;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {0,2,3,4,1,2,1,3,1,10};

		for (int i = 0; i < array.length; i++) {
			System.out.print("[" + array[i] + "]");
		}
		
		
		for (int i = 0; i < array.length; i++) {
			  for(int j = i+1; j < array.length; j++) {
			    if(array[i] == array[j]) {
			    	System.out.println("[" + array[i] + "]");
			    }
			  }
			}
	}

}
