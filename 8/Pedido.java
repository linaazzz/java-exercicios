import java.util.ArrayList;

public class Pedido {
    private Pizza pizza;
    private String tamanho;
    private String endereco;

    private static ArrayList<Pizza> pizzasDisponiveis = Pizza.criarPizzas();
    private static ArrayList<Pedido> pedidos = new ArrayList<>();

    public Pedido(Pizza pizza, String tamanho, String endereco) {
        this.pizza = pizza;
        this.tamanho = tamanho;
        this.endereco = endereco;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getEndereco() {
        return endereco;
    }

    public float getValorTotal() {
        if (tamanho.equalsIgnoreCase("P")) {
            return pizza.getValor() * 1.0f;
        } else if (tamanho.equalsIgnoreCase("M")) {
            return pizza.getValor() * 1.2f;
        } else if (tamanho.equalsIgnoreCase("G")) {
            return pizza.getValor() * 1.5f;
        } else {
            return 0.0f;
        }
    }

    public void exibirPedido() {
        System.out.println("Pizza: " + pizza.getNome());
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Endereço de entrega: " + endereco);
        System.out.println("Valor total: R$ " + getValorTotal());
    }

    public static void adicionarPedido(Pizza pizza, String tamanho, String endereco) {
        Pedido pedido = new Pedido(pizza, tamanho, endereco);
        pedidos.add(pedido);
        System.out.println("Pedido adicionado com sucesso.");
    }

    public static void cancelarPedido(int numPedido) {
        if (numPedido >= 1 && numPedido <= pedidos.size()) {
            pedidos.remove(numPedido - 1);
            System.out.println("Pedido cancelado com sucesso.");
        } else {
            System.out.println("Pedido não encontrado.");
        }
    }

    public static void mostrarRelatorio() {
        System.out.println("Relatório de Pedidos:");
        for (int i = 0; i < pedidos.size(); i++) {
            Pedido pedido = pedidos.get(i);
            System.out.println("Pedido " + (i + 1) + ":");
            pedido.exibirPedido();
        }
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido registrado.");
        }
    }

    public static ArrayList<Pizza> getPizzasDisponiveis() {
        return pizzasDisponiveis;
    }
}