import java.util.Scanner;

public class AtividadeCA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nu1; 
		int nu2;
		int soma;
		System.out.println("Insira o valor");
		nu1 =sc.nextInt();
		nu2 =sc.nextInt();
		soma = nu1 + nu2;
		
		System.out.println("SOMA=" + soma);
		
		sc.close();
	}

}
