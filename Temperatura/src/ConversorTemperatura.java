import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            // Exibir o menu
            System.out.println("Menu:");
            System.out.println("1. Converter Celsius para Fahrenheit");
            System.out.println("2. Converter Fahrenheit para Celsius");
            System.out.println("3. Sair");
            System.out.print("Por favor, selecione uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    // Converter Celsius para Fahrenheit
                    System.out.print("Digite a temperatura em Celsius: ");
                    double celsius = sc.nextDouble();
                    double fahrenheit = (celsius * 9/5) + 32;
                    System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
                    break;

                case 2:
                    // Converter Fahrenheit para Celsius
                    System.out.print("Digite a temperatura em Fahrenheit: ");
                    fahrenheit = sc.nextDouble();
                    celsius = (fahrenheit - 32) * 5/9;
                    System.out.println("Temperatura em Celsius: " + celsius);
                    break;

                case 3:
                    // Sair
                    System.out.println("Já estamos encerrando o conversor...");
                    break;

                default:
                    // Opção inválida
                    System.out.println("Opção inválida! Tente novamente.");
            }

            System.out.println(); // Linha em branco para melhor legibilidade

        } while (opcao != 3); // Continua até que a opção 3 seja escolhida

        sc.close();
    }
}
