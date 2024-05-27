package jogodaadivinhacao;

import java.util.Random;
import java.util.Scanner;

public class Jogodaadivinhacao {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("insira o nome do jogador: ");
        String nome = a.nextLine();
        Random random = new Random();
        int n = random.nextInt(10) + 1;
        int f = 0;
        int contador = 0;
        while (f != n) {
            System.out.println("escreva um numero de 1 a 10");
            contador++;
            f = a.nextInt();
            if (f == n) {
                System.out.println(contador);
                System.out.println("acertou o número sorteado: " + nome + " teve 1 acerto em " + contador + " vezes!");
            } else if (f > n) {

                System.out.println("o número sorteado é menor que o número inserido");
            } else {
                System.out.println("o número sorteado é maior que o número inserido");

            }
        }

    }
}
