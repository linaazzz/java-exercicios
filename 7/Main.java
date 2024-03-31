import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("O que deseja fazer?: ");
            System.out.println("\n1 - Adicionar um produto.");
            System.out.println("2 - Atualizar um produto.");
            System.out.println("3 - Remover um produto.");
            System.out.println("4 - Mostrar estoque.");
            System.out.println("5 - Sair");


            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    Produto.adicionarProduto();
                    break;
                case 2:
                    Produto.atualizarProduto();
                    break;
                case 3:
                    Produto.removerProduto();
                    break;
                case 4:
                    Produto.mostrarEstoque();
                    break;
                case 5:
                    System.out.println("Programa encerrado.");
                    break;
            }
        }while(opcao != 5);
    }
}