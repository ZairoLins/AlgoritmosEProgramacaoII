import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<ItemCarrinho> itens;

    // Construtor
    public Carrinho() {
        this.itens = new ArrayList<>();
    }

    // Adiciona um produto ao carrinho
    public void adicionarProduto(Produto produto, int quantidade) {
        for (ItemCarrinho item : itens) {
            if (item.getProduto().getNome().equalsIgnoreCase(produto.getNome())) {
                // Se o produto já está no carrinho, atualiza a quantidade
                item.setQuantidade(item.getQuantidade() + quantidade);
                return;
            }
        }
        // Se o produto não está no carrinho, adiciona um novo item
        itens.add(new ItemCarrinho(produto, quantidade));
    }

    // Remove um produto do carrinho
    public void removerProduto(String nomeProduto) {
        itens.removeIf(item -> item.getProduto().getNome().equalsIgnoreCase(nomeProduto));
    }

    // Atualiza a quantidade de um produto no carrinho
    public void atualizarQuantidade(String nomeProduto, int quantidade) {
        for (ItemCarrinho item : itens) {
            if (item.getProduto().getNome().equalsIgnoreCase(nomeProduto)) {
                if (quantidade > 0) {
                    item.setQuantidade(quantidade);
                } else {
                    removerProduto(nomeProduto);
                }
                return;
            }
        }
        System.out.println("Produto não encontrado no carrinho.");
    }

    // Calcula o valor total do carrinho
    public double calcularTotal() {
        double total = 0;
        for (ItemCarrinho item : itens) {
            total += item.calcularTotal();
        }
        return total;
    }

    // Exibe o carrinho
    public void exibirCarrinho() {
        if (itens.isEmpty()) {
            System.out.println("O carrinho está vazio.");
        } else {
            System.out.println("Carrinho de compras:");
            for (ItemCarrinho item : itens) {
                System.out.println(item);
            }
            System.out.printf("Total: R$ %.2f\n", calcularTotal());
        }
    }
}
