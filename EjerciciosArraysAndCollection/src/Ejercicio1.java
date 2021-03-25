
public class Ejercicio1 {
	public static void main(String[] args) {
		int[] num1 = {1,2,3,4,5,6};
		int[] num2 = {6,2,3,4,5,1};
		int[] num3 = {0,3,2,4,5,2};
		
	    System.out.println(contiene6(num1) ? "Contiene un 6" : "No contiene 6");
	    System.out.println(contiene6(num2) ? "Contiene un 6" : "No contiene 6");
	    System.out.println(contiene6(num3) ? "Contiene un 6" : "No contiene 6");
	}
	
	public static boolean contiene6(int[] nums) {
		
		return nums[0] == 6 || nums[nums.length-1] == 6 ? true : false;
	}
}
