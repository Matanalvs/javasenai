import java.util.Scanner;

public class Teste {
public static void main(String[] args) {

		System.out.println("Ol�, sou um calculador de IMC, vamos come�ar?");
		 
		System.out.println("Digite o seu nome, para nos conhecermos melhor!");
		Scanner teclado = new Scanner(System.in);
		String nome = teclado.next();		
		System.out.println("Ol�, " + nome + " como vai?");
		System.out.println("...");
		System.out.println("Qual a sua altura "+ nome +" ?");
		Double altura = teclado.nextDouble();
			if(altura >= 1.80) {		
				System.out.println("Legal, voce � um cara bem alto!");
				}
			if(altura<=1.60) {
				System.out.println("Legal, tamanho n�o � documento!");	
				}
			if((altura>1.60) &(altura < 1.80)) {
				System.out.println("Legal, voce tem uma altura mediana");	
				}
		System.out.println("...");
		System.out.println("Agora me diga, qual seu peso?");
		Double peso = teclado.nextDouble();
			if(peso >= 110) {		
				System.out.println("Voce t� meio gordinho, Deseja ver op��es de academia?");
				System.out.println("Digite: 1 para sim, 2 para n�o");
				int opcao = teclado.nextInt();
				if(opcao==1.0) {
					System.out.println("Pesquisa na internet u�, eu sou s� um calculador :(");
				}
				if(opcao==2.0) {
					System.out.println("Certo, vamos seguir ent�o :(");
				}
				
			}		
			if(peso<=45) {
				System.out.println("Voc� vai acabar sumindo ou voando, tome cuidado!");	
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
					System.out.println("Seu IMC �: " + IMC + " , voc� est� passando fome");	
					}
					if((IMC>=18.5)&(IMC<25)){
					System.out.println("Seu IMC �: " + IMC + " , voc� est� saud�vel");	
					}
					if((IMC>=25)&(IMC<30)) {
					System.out.println("Seu IMC �: " + IMC + " , voc� est� com sobrepeso");	
					}
					if((IMC>=30)&(IMC<40)) {
						System.out.println("Seu IMC �: " + IMC + " , voc� est� com Obesidade");	
					}
					if(IMC>40) {
						System.out.println("Seu IMC �: " + IMC + " , cuidado, voc� vai explodir");	
					}
				}
				else {
					System.out.println("Obrigado pela aten��o!");
				}
				teclado.close();					
	}
}


