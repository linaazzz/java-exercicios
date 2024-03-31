import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opção: ");
            System.out.println("\n1 - Fazer um novo Pedido");
            System.out.println("2 - Cancelar um Pedido");
            System.out.println("3 - Relatório de Pedidos");
            System.out.println("4 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Escolha uma pizza:");
                    ArrayList<Pizza> pizzasDisponiveis = Pedido.getPizzasDisponiveis();
                    for (int i = 0; i < pizzasDisponiveis.size(); i++) {
                        System.out.println((i + 1) + " - " + pizzasDisponiveis.get(i).getNome());
                    }
                    System.out.print("Digite o número da pizza desejada: ");
                    int escolhaPizza = scanner.nextInt();
                    if (escolhaPizza >= 1 && escolhaPizza <= pizzasDisponiveis.size()) {
                        Pizza pizzaEscolhida = pizzasDisponiveis.get(escolhaPizza - 1);
                        System.out.print("Tamanho da pizza (P, M, G): ");
                        String tamanho = scanner.next().toUpperCase();
                        System.out.print("Endereço de entrega: ");
                        scanner.nextLine();
                        String endereco = scanner.nextLine();
                        Pedido.adicionarPedido(pizzaEscolhida, tamanho, endereco);
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;
                case 2:
                    System.out.print("Digite o número do pedido que deseja cancelar: ");
                    int numPedido = scanner.nextInt();
                    Pedido.cancelarPedido(numPedido);
                    break;
                case 3:
                    Pedido.mostrarRelatorio();
                    break;
                case 4:
                    System.out.println("Sistema encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}