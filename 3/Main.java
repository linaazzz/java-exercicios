import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        int opcao;

        do{
        System.out.println("Bem vindo ao banco!! Selecione o que deseja fazer :p");
        System.out.println("1. Depositar saldo.");
        System.out.println("2. Sacar valor.");
        System.out.println("3. Ver saldo.");
        System.out.println("4. Sair.");
        opcao = leitor.nextInt();
        
        switch(opcao){

            case 1:
                Conta.depositar();
                break;

            case 2:
                Conta.sacar();

            case 3:
                System.out.println("Saldo: " + Conta.mostrar());
        }
        
        } while (opcao != 4);
    }

}

