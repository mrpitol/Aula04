import java.util.Scanner;

public class Exercicios3Aula4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crie um programa capaz de calcular a tabuada de um n�mero digitado pelo usu�rio.
	
	Scanner leitor= new Scanner(System.in);
	int n,res;
	int contador=1;
	System.out.println("Voc� quer calcular a tabuada de qual n�mero?");
	n=leitor.nextInt();
	System.out.println("");
	System.out.println("Calculando a tabuada do " + n);
	while (contador<=10) {
		res = n * contador;
		System.out.println(n+ "x" + contador + " = " + res);
		contador =contador+1;
	}
	System.out.println("");
	System.out.println("Valores da tabuada do " + n);
	leitor.close();
	}
}
