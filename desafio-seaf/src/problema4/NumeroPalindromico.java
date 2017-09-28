package problema4;

public class NumeroPalindromico {

	public static void main(String[] args) {
		int numero = 0;	
		int produto;
		int numeroInvertido = 0;
		System.out.println("Iniciando...");
		
		rotulo:for(int i = 999; i >= 100; i--){			
			
			for(int j = 999; j >= 100; j--){
				numero = (int)i*j; 
				produto = numero;
				numeroInvertido = 0; 
				System.out.println(numero);
				while (numero > 0) { 
					numeroInvertido *= 10; 
					numeroInvertido += (numero % 10); 
					numero /= 10; 
				}			
			
				if(produto == numeroInvertido){
					System.out.println("Maior Palindrômico "+ i + " * " + j + " = " + numeroInvertido);
					break rotulo;
				}
			}
		}
	}

}
