import java.util.Scanner;

public class Vogais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ler a palavra do usuário
        System.out.print("Escreva uma palavra: ");
        String palavra = sc.nextLine().toLowerCase(); // Converte para minúsculas

        int contadorVogais = 0;

        // Iterar sobre cada caractere da palavra
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            // Verifica se o caractere atual é uma vogal
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contadorVogais++;
            }
        }

        // Exibir o total de vogais encontradas
        System.out.println("A palavra contém " + contadorVogais + " vogal(is).");

        sc.close();
    }
}
