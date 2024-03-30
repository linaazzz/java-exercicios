import java.util.Scanner;

public class Livros {

    String titulo;
    String autor;
    int ano;

    Scanner leitor = new Scanner(System.in);
    
    void inserir(){
        System.out.println("Digite o autor do livro desejado: ");
        autor = leitor.nextLine();
        System.out.println("Digite o título do livro: ");
        titulo = leitor.nextLine();
        System.out.println("Digite o ano do livro: ");
        ano = leitor.nextInt();
    }

    void exibir(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de lançamento: " + ano);
    }
}
