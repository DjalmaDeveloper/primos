import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");

        int n = sc.nextInt();

        while (n <= 0){
            System.out.println("Número Inválido! Tente outro valor:");
            n = sc.nextInt();
        }

        int primos = 0;

        for (int i = 1; i <= n; i++){
            int divisores = 0;

            for (int j = 1; j <= i; j++){
                if (i % j == 0){
                    divisores++;
                }
            }

            if (divisores <= 2){
                ++primos;
                System.out.println(i);
            }
        }

        System.out.println("Número de Primos: " + primos);
        System.out.println("Número escolhido: " + n);

        sc.close();
    }
}
