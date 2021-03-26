import java.util.ArrayList;


public class Main {
	public static void main(String[] args) {
		ArrayList<String> colores = new ArrayList<String>();
		colores.add("Rojo");
		colores.add("Verde");
		colores.add("Amarillo");
		colores.add("Azul");
		colores.add("Negro");
		
		System.out.println(colores);
		
		System.out.println("=====================");
	   for (String string : colores) {
		System.out.println(string);
	}
	   
		System.out.println("=====================");

		colores.stream().forEach(color -> System.out.println(color));
		
		System.out.println("=====================");

		colores.stream().forEach(System.out::println);
		
		System.out.println("=====================");

		
		System.out.println("Prueba para el cambio en el repositorio de git");
	}
}
