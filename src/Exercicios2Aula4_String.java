import java.util.Scanner;

public class Exercicios2Aula4_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 02 - Crie um programa que exija que o usuário digite a senha 42. Enquanto o usuário não acertar a senha, deve ser exibida a mensagem "Qual é a resposta para a vida, o universo e tudo mais?"
		Scanner leitor=new Scanner (System.in);
		String resposta="";
		
	while(!resposta.equals("42")) {
		System.out.println("Qual é a resposta para a vida, o universo e tudo mais?");
		resposta=leitor.next();
	}
		System.out.println("Você Acertou, Parabéns Mochileiro");
		leitor.close();
	}
	
}
