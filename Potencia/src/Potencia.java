import java.util.Scanner;

public class Potencia {

    // Função que calcula a potência usando multiplicação repetida
    public static int calcularPotencia(int base, int expoente) {
        int resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura da base e do expoente
        System.out.print("Digite a base: ");
        int base = sc.nextInt();
        System.out.print("Digite o expoente: ");
        int expoente = sc.nextInt();

        // Calcula e exibe o resultado
        int resultado = calcularPotencia(base, expoente);
        System.out.println("Resultado de " + base + "^" + expoente + " = " + resultado);

        sc.close();
    }
}
