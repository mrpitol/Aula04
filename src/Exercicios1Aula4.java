
public class Exercicios1Aula4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//01 - Crie um programa que seja capaz de exibir todos os números inteiros entre 0 e 1000.(Se você conseguir, modifique o programa para que mostre apenas os números pares)
		int numeros=0;
		while (numeros<=1000) {
			if(numeros % 2==0)
			System.out.println(numeros);
			numeros=numeros+1; // ou trocar o soma 1 por 2
		}
		
	}

}
