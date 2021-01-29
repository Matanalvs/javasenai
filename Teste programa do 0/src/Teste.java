import java.util.Scanner;

public class Teste {
public static void main(String[] args) {

		System.out.println("Olá, sou um calculador de IMC, vamos começar?");
		 
		System.out.println("Digite o seu nome, para nos conhecermos melhor!");
		Scanner teclado = new Scanner(System.in);
		String nome = teclado.next();		
		System.out.println("Olá, " + nome + " como vai?");
		System.out.println("...");
		System.out.println("Qual a sua altura "+ nome +" ?");
		Double altura = teclado.nextDouble();
			if(altura >= 1.80) {		
				System.out.println("Legal, voce é um cara bem alto!");
				}
			if(altura<=1.60) {
				System.out.println("Legal, tamanho não é documento!");	
				}
			if((altura>1.60) &(altura < 1.80)) {
				System.out.println("Legal, voce tem uma altura mediana");	
				}
		System.out.println("...");
		System.out.println("Agora me diga, qual seu peso?");
		Double peso = teclado.nextDouble();
			if(peso >= 110) {		
				System.out.println("Voce tá meio gordinho, Deseja ver opções de academia?");
				System.out.println("Digite: 1 para sim, 2 para não");
				int opcao = teclado.nextInt();
				if(opcao==1.0) {
					System.out.println("Pesquisa na internet ué, eu sou só um calculador :(");
				}
				if(opcao==2.0) {
					System.out.println("Certo, vamos seguir então :(");
				}
				
			}		
			if(peso<=45) {
				System.out.println("Você vai acabar sumindo ou voando, tome cuidado!");	
				}
			if((peso>45) &(peso < 110)) {
				System.out.println("Legal, voce tem um peso legal");	
			}
		System.out.println("Agora vamos calcular finalmente seu IMC!");
		Double IMC= peso/(altura*2);
		System.out.println("Digite 1 para calcular e 2 para cancelar");
			int opcao2 = teclado.nextInt();
				if(opcao2==1) {
					if(IMC<18.5){
					System.out.println("Seu IMC é: " + IMC + " , você está passando fome");	
					}
					if((IMC>=18.5)&(IMC<25)){
					System.out.println("Seu IMC é: " + IMC + " , você está saudável");	
					}
					if((IMC>=25)&(IMC<30)) {
					System.out.println("Seu IMC é: " + IMC + " , você está com sobrepeso");	
					}
					if((IMC>=30)&(IMC<40)) {
						System.out.println("Seu IMC é: " + IMC + " , você está com Obesidade");	
					}
					if(IMC>40) {
						System.out.println("Seu IMC é: " + IMC + " , cuidado, você vai explodir");	
					}
				}
				else {
					System.out.println("Obrigado pela atenção!");
				}
				teclado.close();					
	}
}


