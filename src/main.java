import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");

        int n = sc.nextInt();

        while (n <= 2){
            System.out.println("Número Inválido! Tente outro valor:");
            n = sc.nextInt();
        }

        System.out.println("Número de primos " + Calculations.quantidadePrimos(n));
        System.out.println("Números primos:" + Calculations.listaPrimos(n));

        sc.close();
    }
}
