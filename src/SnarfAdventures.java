import java.io.IOException;
import java.util.Scanner;
/* Exemplo de adventure text, proposto aos alunos do módulo de
 * lógica de programação da imersão Java Xpert
 * */
public class SnarfAdventures {

	public static void main(String[] args) {
		
		String nome;
		String escolha;
		Scanner leitor = new Scanner(System.in);
		System.out.println("SNARF ADVENTURES");
		System.out.println("Um jogo de André David");
		
		
		System.out.println("Seu objetivo é enfrentar os perigos para que voce consiga alimentar o FEROZ e TERRÍVEL Snarf. Qual é seu nome, aventureiro?");
		nome = leitor.next();
		
		System.out.println("Voce está pronto para começar? SIM ou NÃO");
		escolha = leitor.next();
	
		if (escolha.equalsIgnoreCase("sim")) {
			//Aqui eu dou sequencia na história na parte do sim
			System.out.println("Voce está em uma sala escura. Não ve nada. Mas tem uma LANTERNA, uma GARRAFA e um BAIXO. Qual objeto deseja usar?");
			escolha = leitor.next();
			if(escolha.equalsIgnoreCase("lanterna")) {
				//Aqui o que acontece se ele escolher lanterna
				System.out.println("Ao acender a lanterna, voce viu um simbolo antigo");
				System.out.println("$$$$$$$$$$$$$$$$$L   .$$$$$$$$$$$$$$$u");
				System.out.println("$$$$$$$$$$$$$$$$$$N.@$$$$$$$$$$$$$$$$ *");
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ '>.n=L");
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$RR$$$$ 'b\"  9");
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$R#\"  .$$$$ @   .*");
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$`   .e$$$$$$$P   e\"");
				System.out.println("$$$$$$$$$$$$$$$$$$$$$R#    o$$$$$$$$P   @");
				System.out.println("$$$$$$$$$$$$$$$$$$$P\" .e> 4$\" '$$$$F  .F");
				System.out.println("$$$$$$$$$$$$$$$$$R  .$$$& '$   $$$$  .#>");
				System.out.println("$$$$$$$$$$$$$$$$$b.o$$$$$  $N  \"$$\" .\"'>");
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$  $$N  \"` .$ '>");
				System.out.println("$$$$$$$$$$$$$$ \"$$$$$$$$R  $$$&    $$ '>");
				System.out.println("$$$$$$$$$$$$$$  E\"$$P`9$E  $$$$   8$$ '>");
				System.out.println("$$$$$$$$$$$$$$  E  \"  9$F  $$$$k .$$$ '>");
				System.out.println("$$$$$$$$$$$$$$  E     9$N  $$$$$$$$$$ '>");
				System.out.println("$$$$$$$$$$$$$$  E     9$$.u$$$$$$$$$$ '>");
				System.out.println("$$$$$$$$$$$$$$ o\"     9$$$$$$$$$$$$$$ d");
				System.out.println("**************#       ***************\"");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("Além do símbolo antigo, você encontrou também uma porta. Deseja investigar o SIMBOLO ou a PORTA?");
				escolha = leitor.next();
				
				if(escolha.equalsIgnoreCase("SIMBOLO")) {
					//O que acontece se ele escolher o símbolo
					System.out.println("Você decidiu investigar o símbolo... Music Television... O que é isso?");
					System.out.println(".");
					System.out.println("..");
					System.out.println("...");
					System.out.println("BUM! Enquanto você confabula, a parede explode! Quando a poeira baixa, Supla está do outro lado em sua moto.");
					System.out.println("Infelizmente isso foi o suficiente para que Snarf fugisse com ele para viver grandes aventuras.");
					System.out.println("GAME OVER");
				}else if (escolha.equalsIgnoreCase("PORTA")) {
					//O que acontece se ele escolher porta
					System.out.println("Ao caminhar até a porta você nota que as cordas do seu baixo começam a vibrar... Alguma frequência as agita.");
					System.out.println("Você deseja tocar as mesmas cordas para encontrar a frequência certa?");
					System.out.println("SIM ou NÃO");
					escolha = leitor.next();
					
					if(escolha.equalsIgnoreCase("SIM")) {
						System.out.println("EXCELENTE ideia! Ao tocar as notas LÁ, LÁ, LÁ, LÁ, RÉ, MI, a tranca se abre! Hey, Ho, Let's go!");
						System.out.println("Enquanto você decide se entra ou não pela porta, ouve um miado. Deseja VER o que está acontecendo? SIM ou NÃO");
						escolha = leitor.next();
						
						if(escolha.equalsIgnoreCase("SIM")) {
							//Caso ele escolha cruzar a porta
							System.out.println("Ao cruzar a porta você encontra ele, o pequeno Snarf, bochechando o saco de ração e esperando ansiosamente por você");
							System.out.println("Quando você coloca a ração, o pequeno felino rola de tanta alegria e te dá pequenas mordidas carinhosas na mão");
							System.out.println("Esse é o maior prêmio que alguém pode receESPERE! TEM ALGO NO CHÃO, AO LADO DO GATINHO!");
							System.out.println("Você verifica o que te chamou a atenção e um pequeno brilho revela... UMA FORTUNA! Você agora é um rico tutor de gatos! Parabéns, " + nome);
						}else {
							//Caso ele escolha não cruzar a porta
							System.out.println("Sua indecisão foi seu fim... Enquanto você pensava, o miado foi se distanciando até se tornar inaudível. GAME OVER");
						}
					}else {
						//Caso escolha não tocar o baixo
						System.out.println("Sua indecisão foi seu fim... Enquanto você pensava, ouve um miado que foi se distanciando até se tornar inaudível. GAME OVER");
					}
					
					
				}else {
					//O que acontece se ele escrever qualquer outra coisa
					System.out.println("O faminto Snarf não pode esperar a sua coragem surgir. Voce está fora da jogada... GAME OVER");
				}


				
			}else {
				if(escolha.equalsIgnoreCase("garrafa")) {
					//Aqui o que acontece se ele escolher garrafa
					System.out.println("A sua garrafa parece vazia. O Snarf pode ter sede. Deseja encher a garrafa? SIM ou NÃO");
					escolha = leitor.next();
					if(escolha.equalsIgnoreCase("sim")) {
						//Aqui o que acontece se ele escolher encher a garrafa
						System.out.println("O Snarf ouviu o barulho da água e veio até você");
						System.out.println("Você usa a lanterna e vê a porta aberta, por onde o snarf saiu. Lá está um saco de ração!");
						System.out.println("Quando você coloca a ração, o pequeno felino rola de tanta alegria e te dá pequenas mordidas carinhosas na mão");
						System.out.println("Esse é o maior prêmio que alguém pode receber, " + nome);
					}else {
						//Aqui o que acontece se ele não encher a garrafa
						System.out.println("Um aventureiro desitradado é um aventureiro em perigo, " + nome + "!\nInfelizmente suas pedras renais te lembraram disso e você está fora da jogada! GAME OVER!");
					}
					
				}else {
					if(escolha.equalsIgnoreCase("baixo")) {
						//Aqui o que acontece se ele escolher baixo
						System.out.println("Você começa a tocar e lembra da canção favorita do seu gatinho. Infelizmente, a lembrança não te motiva a seguir a aventura, e você acaba adormecendo. GAME OVER.");
					}else {
						System.out.println("Que pena. Voce se atrapalhou na hora de escolher e um aventureiro mais bem preparado já conquistou o premio. GAME OVER");
					}
				}
			}
			
			
			
		}else {
			System.out.println("O faminto Snarf não pode esperar a sua coragem surgir. Voce está fora da jogada... GAME OVER");
		}
		leitor.close();

	}

}
