package problema7;

import java.util.Scanner;

public class Primos {

	public static void main(String[] args) {
		int contadorDePrimos = 0;
		int primoFinal = 10001;
		
		Scanner leitor = new Scanner(System.in);
		
		
		try{
			do{
				if(primoFinal <= 0)
					System.out.println("Digite a posi��o no n�mero primo que deseja encontrar. (OBS.: Dessa vez o n�meor precisa ser positivo ;)");
				else
					System.out.println("Digite a posi��o no n�mero primo que deseja encontrar.");
				primoFinal = leitor.nextInt();
			
			}while(primoFinal <= 0);
		}catch (Exception e) {
			System.out.println("Entrada com valor inv�lido.");
			return;
		}
		for (int primo = 2; contadorDePrimos <= primoFinal; primo++) {
			int cont = 0;
			
			for (int i = 1; i < primo; i++) {
				if (primo % i == 0){
					cont++;
					if(cont > 1)
						break;
				}
			}
			if(cont <= 1){
				++contadorDePrimos;
				if(contadorDePrimos == primoFinal){
					System.out.println("Posi��o: " + contadorDePrimos+"� = " + "Esse e o n�mero primo desta posi��o: " + primo);
					break;
				}else
					System.out.println("Posi��o " + contadorDePrimos+"� = " + primo);
			}
			
		}
	}

}
