import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Livros> biblioteca = new ArrayList<Livros>();
        Scanner leitor = new Scanner(System.in);
        
        int opcao;
        int i;

        do {
            System.out.println("Bem vindo a sua livraria!! O que você deseja fazer?");
            System.out.println("1. Adicionar um livro");
            System.out.println("2. Ver coleção de livros");
            System.out.println("3. Encerrar programa");
            opcao = leitor.nextInt();

            switch(opcao) {
                case 1:
                    Livros livro = new Livros();
                    livro.inserir();
                    biblioteca.add(livro);
                    break;

                case 2:
                    for(i = 0; i < biblioteca.size(); i++) {
                        biblioteca.get(i).exibir();
                    }
                    break;
                
                case 3:
                    System.out.println("Obrigado!");
                    break;
            }
        } while (opcao != 3);
    }
}
