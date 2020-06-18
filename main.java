package jogovelha;

import java.util.Scanner;

public class main {
		
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		game jogo = new game();
		String posicao;
		
		int valida = 0, Jogadas = 0;
		
		while(true) {
			System.out.printf("Jogo da Velha\n\n");
			jogo.tabuleiro();
			
			do{
				
				System.out.print("Vez do Jogador 1");
				
				posicao = ler.next();
				
				while(!jogo.Valido(posicao)) {
					
					System.out.printf("Jogada inválida!");
					System.out.print("Vez do Jogador 1\n");
					posicao = ler.next();
					valida = 0;
				}
				
				jogo.Jogada(posicao, "X");
				valida = 1;
				
			}while(valida == 0);
			
			Jogadas++;
			valida = 0;
			jogo.tabuleiro();
			if(!jogo.Venceu(Jogadas).equals("null")) {
				break;
			}
			
			do{
				
				System.out.println("Vez do Jogador 2");
				posicao = ler.next();
				
				while(!jogo.Valido(posicao)) {
					System.out.println("Jogada inválida!");
					System.out.println("Vez do Jogador 2\n");
					posicao = ler.next();
					valida = 0;
				}
				
				jogo.Jogada(posicao, "O");
				valida = 1;
				
			} while(valida == 0);
			
				Jogadas++;
				valida = 0;
				jogo.tabuleiro();
				if(!jogo.Venceu(Jogadas).equals("null")) {
					break;
				}
		}
		
		System.out.println("O "+jogo.Venceu(Jogadas)+ " venceu!");
			
	}

}
