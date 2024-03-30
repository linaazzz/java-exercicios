public class Calculadora {

    public static int soma(int a, int b){
        return a + b;
    }

    public static int sub(int a, int b){
        return a - b;
    }

    public static int mult(int a, int b){
        return a * b;
    }

    public static int divisao(int a, int b){
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Divisão por 0 não é permitida.");
            return 0;
        }
    }
}