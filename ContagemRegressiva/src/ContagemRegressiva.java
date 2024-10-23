import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ler um número inteiro positivo do usuário
        System.out.print("Insira qualquer número inteiro positivo: ");
        int numero = sc.nextInt();

        // Verifica se o número é positivo
        if (numero < 0) {
            System.out.println("Por favor, insira um número positivo.");
        } else {
            System.out.println("Contagem regressiva:");
            // Contagem regressiva
            for (int i = numero; i >= 0; i--) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
