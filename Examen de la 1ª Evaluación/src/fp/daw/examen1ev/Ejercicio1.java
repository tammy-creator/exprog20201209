package fp.daw.examen1ev;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] array;
		String cadena;
		
		System.out.println("Introduce una línea de texto");
		 
		Scanner teclado = new Scanner (System.in);
		cadena=teclado.nextLine();
		cadena=cadena.toLowerCase();
		array=cadena.toCharArray();
		
		for(int i=0; i<array.length;i++) {
			
			System.out.print(array[i]+",");
		}
		
		teclado.close();
		
		
	}

}
