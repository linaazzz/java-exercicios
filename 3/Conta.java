import java.util.Scanner;

public class Conta {

    static float saldo; 

    public static void depositar(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantia que você quer depositar: ");
        float deposita = scanner.nextFloat(); 
        saldo = saldo + deposita;
    }

    public static void sacar(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantia que você deseja sacar: ");
        float saca = scanner.nextFloat(); 
        if(saldo < saca){
            System.out.print("Você não tem esse valor!");
        } else {
        saldo = saldo - saca;
        }
    }

    public static float mostrar(){ 
        return saldo;
    }

}