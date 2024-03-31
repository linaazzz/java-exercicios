import java.util.Scanner;
import java.util.List;

public class Agenda {
    private Scanner leitor = new Scanner(System.in);

    public void adicionarContato(List<Contato> contatos) {
        System.out.println("Digite o nome: ");
        String nome = leitor.nextLine();

        System.out.println("Digite o número: ");
        String numero = leitor.nextLine();

        Contato novoContato = new Contato(nome, numero);
        contatos.add(novoContato);

        System.out.println("Contato adicionado com sucesso.");
    }

    public void removerContato(List<Contato> contatos) {
        System.out.println("Digite o nome do contato para remover: ");
        String nome = leitor.nextLine();
    
        boolean removido = false;
    
        for (int i = 0; i < contatos.size(); i++) {
            Contato contato = contatos.get(i);
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contatos.remove(i);
                removido = true;
                System.out.println("Contato removido com sucesso.");
                break;
            }
        }
    
        if (!removido) {
            System.out.println("Contato não encontrado.");
        }
    }
    

    public void buscarContato(List<Contato> contatos) {
        System.out.println("Digite o nome do contato para buscar: ");
        String nome = leitor.nextLine();

        boolean encontrado = false;

        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Nome: " + contato.getNome() + ", Número: " + contato.getTelefone());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Contato não encontrado.");
        }
    }
}