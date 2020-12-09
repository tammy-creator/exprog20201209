package fp.daw.examen1ev;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		esBisiesto(2021);
	}
 public static boolean esBisiesto(int ano) {
	 
	 if(ano%4==0 || ano%400==0) {
		 return true;
	 }else {
		 return false;
	 }
 }
}
