package fp.daw.examen1ev;



public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		max3x3sum(4,4);
		
	}
	public static void max3x3sum (int N, int M) {
		
		
		int suma=0;
		int aux1=0;
		int aux2=3;
		int aux3=0;
		
		if(N>3 && M>3) {
			int[][]matriz = new int[N][M];
			for(int i=0;i<N; i++) {
				for(int j=0;j<M;j++) {
					matriz[i][j]=1+j+i;
					System.out.print(matriz[i][j]);
				}
				System.out.println();
			}
			do {
				for(int i=aux1;i<aux2;i++) {
					for(int j=aux1; j<aux2;j++) {
						aux3+=matriz[i][j];
					}
				}
				if(aux3>suma) {
					suma=aux3;
				}
				aux1++;
				aux2++;				
			}while(aux2<=N);
			
			System.out.println("La mayor suma es: "+suma);
			
		}
	}
}
