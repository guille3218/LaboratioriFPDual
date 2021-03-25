

public class Ejercicio2 {
	public static void main(String[] args) {
		int[] num1 = {1,2,3,4,5,6};
		int[] num2 = {6,2,3,4,5,1};
		int[] num3 = {0,4,7,4,5,6};
		
	    System.out.println(contiene2o3(num1) ? "No contiene" : "contiene");
	    System.out.println(contiene2o3(num2) ? "No contiene" : "contiene");
	    System.out.println(contiene2o3(num3) ? "No contiene" : "contiene");
	}
	
	public static boolean contiene2o3(int[] nums) {
		
		
		for (int i : nums) {
			 if(i == 2 || i == 3) {
				 return false;
			 }
					 
		}
		
		return true;
	
	}
}
