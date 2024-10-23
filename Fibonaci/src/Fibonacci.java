import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ler o valor de N do usuário
        System.out.print("Digite um numero: ");
        int N = sc.nextInt();

        // Verifica se o valor de N é válido
        if (N <= 0) {
            System.out.println("Por favor, insira um número maior que 0.");
        } else {
            // Variáveis para armazenar os dois primeiros números da sequência
            int anterior = 0, atual = 1;

            System.out.print("Sequência de Fibonacci: ");

            // Exibe o primeiro número da sequência, caso N >= 1
            if (N >= 1) {
                System.out.print(anterior + " ");
            }

            // Exibe o segundo número da sequência, caso N >= 2
            if (N >= 2) {
                System.out.print(atual + " ");
            }

            // Exibe os próximos números da sequência, caso N > 2
            for (int i = 3; i <= N; i++) {
                int proximo = anterior + atual;
                System.out.print(proximo + " ");
                anterior = atual;
                atual = proximo;
            }
        }

        sc.close();
    }
}
