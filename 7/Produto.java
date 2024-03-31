import java.util.ArrayList;
import java.util.Scanner;

public class Produto {
    private String nome;
    private String codigo;
    private int quantidade;
    private float preco;
    private static ArrayList<Produto> estoque = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public Produto(String nome, String codigo, int quantidade, float preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    void setPreco(float preco) {
        this.preco = preco;
    }

    String getNome() {
        return this.nome;
    }

    String getCodigo() {
        return this.codigo;
    }

    int getQuantidade() {
        return this.quantidade;
    }

    float getPreco() {
        return this.preco;
    }

    int getQuantidade(int quantidade) {
        return this.quantidade;
    }

    void atualizarProduto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    static void adicionarProduto() {
        System.out.print("Nome do Produto: ");
        String nome = scanner.next();
        System.out.print("Código do Produto: ");
        String codigo = scanner.next();
        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();
        System.out.print("Preço: ");
        float preco = scanner.nextFloat();

        Produto produto = new Produto(nome, codigo, quantidade, preco);
        estoque.add(produto);
        System.out.println("Produto adicionado ao estoque.");
    }

    static void atualizarProduto() {
        System.out.print("Digite o código do produto que deseja atualizar: ");
        String codigo = scanner.next();
    
        for (int i = 0; i < estoque.size(); i++) {
            Produto produto = estoque.get(i);
            if (produto.getCodigo().equals(codigo)) {
                System.out.print("Novo nome do produto: ");
                String nome = scanner.next();
                float novoPreco;
                while (true) {
                    System.out.print("Novo preço do produto: ");
                    if (scanner.hasNextFloat()) {
                        novoPreco = scanner.nextFloat();
                        break;
                    } else {
                        System.out.println("Por favor, insira um valor válido para o preço.");
                        scanner.next(); // Limpar o buffer do scanner
                    }
                }
                produto.atualizarProduto(nome, novoPreco);
                System.out.println("Produto atualizado com sucesso.");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }
    

    static void removerProduto() {
        System.out.print("Digite o código do produto que deseja remover: ");
        String codigo = scanner.next();

        for (int i = 0; i < estoque.size(); i++) {
            Produto produto = estoque.get(i);
            if (produto.getCodigo().equals(codigo)) {
                estoque.remove(i);
                System.out.println("Produto removido do estoque.");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    static void mostrarEstoque() {
        System.out.println("Produtos no Estoque:");
        for (int i = 0; i < estoque.size(); i++) {
            Produto produto = estoque.get(i);
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Código: " + produto.getCodigo());
            System.out.println("Quantidade: " + produto.getQuantidade());
            System.out.println("Preço: " + produto.getPreco());
        }
    }
}