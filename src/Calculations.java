import java.util.ArrayList;

public class Calculations {

    // Retorna um valor booleano se o número é primo
    public static boolean primo(int n){
        int divisores = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                divisores++;
            }
        }
        return divisores == 2;
    }

    // Retorna o número de primos que vem antes do número fornecido
    public static int quantidadePrimos(int n){
        int primos = 0;

        for (int i = 1; i <= n; i++){

            if (primo(i)){
                ++primos;
            }
        }
        return primos;
    }

    // Retorna uma lista de todos os números primos que vão do 2 até o número digitado
    public static ArrayList<Integer> listaPrimos(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 2; i <= n; i++){
            if (primo(i)){
                list.add(i);
            }
        }
        return list;
    }
}
