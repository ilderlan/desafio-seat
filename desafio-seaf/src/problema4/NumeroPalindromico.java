package problema4;

import java.util.Scanner;

public class NumeroPalindromico {

	public static void main(String[] args) {
		int numero = 0;	
		int produto;
		int numeroInvertido = 0;
		int inicioDoIntervalo = 100;
		int fimDoIntervalo = 999;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Iniciando...");
		
		try{
			System.out.println("Digite o número que determina o ínicio do intervalo de busca!");
			inicioDoIntervalo = leitor.nextInt();
			System.out.println("Digite o número que determina o fim do intervalo de busca!");
			fimDoIntervalo =leitor.nextInt();
		}catch (Exception e) {
			System.out.println("Valor digitado invalido.");
		}
		
		rotulo:for(int i = fimDoIntervalo; i >= inicioDoIntervalo; i--){			
			
			for(int j = fimDoIntervalo; j >= inicioDoIntervalo; j--){
				numero = i*j; 
				produto = numero;
				numeroInvertido = 0; 
				
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
