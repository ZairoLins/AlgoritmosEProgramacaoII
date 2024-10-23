import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declarar as variáveis
        int base, expoente, total = 1, contador = 0;

        // Ler a base e o expoente
        System.out.print("Digite o valor da Base: ");
        base = sc.nextInt();
        System.out.print("Digite o valor do Expoente: ");
        expoente = sc.nextInt();

        // Estrutura de repetição para multiplicação repetida
        while (contador < expoente) {
            total = total * base;
            contador = contador + 1;
        }

        // Exibir o resultado
        System.out.println("Resultado: " + total);

        sc.close();
    }
}

