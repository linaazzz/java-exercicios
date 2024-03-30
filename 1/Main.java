import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
    
        System.out.print("Informe o primeiro número: ");
        int numero1 = leitor.nextInt();

        System.out.print("Informe o segundo número: ");
        int numero2 = leitor.nextInt();

        System.out.print("Informe operação desejada (+, -, *, /): ");
        String operacao = leitor.next(); 

        switch (operacao) {
            case "+": 
                System.out.println("Resultado: " + Calculadora.soma(numero1, numero2));
                break;
            case "-": 
                System.out.println("Resultado: " + Calculadora.sub(numero1, numero2));
                break;
            case "*": 
                System.out.println("Resultado: " + Calculadora.mult(numero1, numero2));
                break;
            case "/": 
                System.out.println("Resultado: " + Calculadora.divisao(numero1, numero2));
                break;
            default:
                System.out.println("Essa operação é desconhecida.");
        }
    }
}
