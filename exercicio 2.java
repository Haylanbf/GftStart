Import java.util.Scanner;

public class Exercicio2 {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Escolha a op��o desejada: 1-Idade, 2-IMC ou 3-sair.");
	
	int x = sc.nextInt();
	
	
	switch(x) {
		case 1: 
			int ano = sc.nextInt();
			int anoAtual = sc.nextInt();
			int idade = anoAtual - ano;
			System.out.println("Sua idade �: " + idade);
			
		case 2: 
			double altura = sc.nextDouble;
			double peso = sc.nextDouble;
			double imc = peso / (altura*altura);
			System.out.println("Seu imc �: " + imc);
			
			
		case 3: 
			System.out.println("Saindo...");
			break;
			
		default: System.out.println("Digite um valor v�lido: 1, 2 ou 3");
			
	}
	
}

}