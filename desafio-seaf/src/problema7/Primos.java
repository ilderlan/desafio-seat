package problema7;

public class Primos {

	public static void main(String[] args) {
		int contadorDePrimos = 0;
		int primoFinal = 10001;
		
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
					System.out.println("Posição: " + contadorDePrimos+"° = " + "Esse e o primo que eu quero: " + primo);
					break;
				}else
					System.out.println("Posição " + contadorDePrimos+"° = " + primo);
			}
			
		}
	}

}
