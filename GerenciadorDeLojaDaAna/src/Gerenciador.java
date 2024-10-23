import java.util.Scanner;

public class Gerenciador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criação de produtos disponíveis
        Produto produto1 = new Produto("Camiseta", 49.90);
        Produto produto2 = new Produto("Calça", 99.90);
        Produto produto3 = new Produto("Tênis", 199.90);

        // Cria o carrinho de compras
        Carrinho carrinho = new Carrinho();

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar produto ao carrinho");
            System.out.println("2. Remover produto do carrinho");
            System.out.println("3. Atualizar quantidade de um produto");
            System.out.println("4. Ver carrinho");
            System.out.println("5. Finalizar");

            int opcao = sc.nextInt();
            sc.nextLine();  // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.println("Escolha um produto para adicionar:");
                    System.out.println("1. Camiseta - R$ 49.90");
                    System.out.println("2. Calça - R$ 99.90");
                    System.out.println("3. Tênis - R$ 199.90");
                    int escolhaProduto = sc.nextInt();
                    System.out.print("Digite a quantidade: ");
                    int quantidade = sc.nextInt();

                    if (escolhaProduto == 1) {
                        carrinho.adicionarProduto(produto1, quantidade);
                    } else if (escolhaProduto == 2) {
                        carrinho.adicionarProduto(produto2, quantidade);
                    } else if (escolhaProduto == 3) {
                        carrinho.adicionarProduto(produto3, quantidade);
                    } else {
                        System.out.println("Produto inválido.");
                    }
                    break;

                case 2:
                    System.out.print("Digite o nome do produto a remover: ");
                    String nomeRemover = sc.nextLine();
                    carrinho.removerProduto(nomeRemover);
                    break;

                case 3:
                    System.out.print("Digite o nome do produto para atualizar a quantidade: ");
                    String nomeAtualizar = sc.nextLine();
                    System.out.print("Digite a nova quantidade: ");
                    int novaQuantidade = sc.nextInt();
                    carrinho.atualizarQuantidade(nomeAtualizar, novaQuantidade);
                    break;

                case 4:
                    carrinho.exibirCarrinho();
                    break;

                case 5:
                    continuar = false;
                    System.out.println("Compra finalizada. Total a pagar: R$ " + carrinho.calcularTotal());
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }
}
