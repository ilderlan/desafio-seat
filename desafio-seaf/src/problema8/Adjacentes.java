package problema8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Adjacentes {
	public static void main(String[] args) {
		long produto = 0;
		long maiorProduto = 0;
		int index = 0;
		int numerosAdjacentes = 0; //-1  Nessa logica considerei o zero
		String impressao = "";
		
		String busca = "";//O valor da busca tem que ser colocado em uma unica linha =(
						
		BufferedReader	leitor;
        leitor = new BufferedReader(new InputStreamReader(System.in));
       	
		try{
			System.out.println("Digite o número para busca do produto dos adjacentes");
			busca = leitor.readLine();
			System.out.println("Quanditdade de números adjacentes?");
			
			numerosAdjacentes = Integer.parseInt(leitor.readLine());
			--numerosAdjacentes;
			
			leitor.close();
		}catch (IOException  e) {
			System.out.println(e.getMessage());
			System.out.println("Algo errado não está certo. Não validou perdeu =(");
		}
		
		for(int i = 0; i < busca.length() - numerosAdjacentes; i++){
			produto = 1;
			
			for(int j = i + numerosAdjacentes; j >= i; j--){				
				produto *= Character.getNumericValue(busca.charAt(j));
				if(produto == 0)
					break;
			}
			
			
			if(maiorProduto < produto){
				maiorProduto = produto;
				index = i;
			}	
		}
				
		System.out.println("Index da primeira ocorrência " + index);
		
		for(int j = 0; j <= numerosAdjacentes; j++){
			impressao += ""+Character.getNumericValue(busca.charAt(index + j));	
			if(j == numerosAdjacentes)
				impressao += " = ";
			else
				impressao += " * ";
		}
		
		System.out.println(impressao + maiorProduto);	
		
	}
		
}
