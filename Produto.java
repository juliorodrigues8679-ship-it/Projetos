public class Produto {
    String nome;
    double preco;

    void exibirProduto() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
    }
}